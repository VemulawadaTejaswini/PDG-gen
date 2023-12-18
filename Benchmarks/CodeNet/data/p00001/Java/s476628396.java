import java.io.IOException;
import java.util.*;

public class Main {
	public static void main(String args[]) throws IOException{
	  int max = 0;
	  ArrayList<Integer> hills = new ArrayList<Integer>();
      System.out.println("input the height of 10 hills");
      for(int i=0;i<10;i++){
    	  int x = System.in.read();
          hills.add(x);
       }
      for(int i = 0; i < 10; i++)
      {
	    for(int j = i + 1; j < 10; j++)
	    {
	     if(hills.get(i) < hills.get(j))
	     {
	      int temp = hills.get(i);
		  hills.set(i,hills.get(j));
		  hills.set(j,temp);
	     }	     
	   }	 
	 }
	 for(int i = 0; i < 3; i++)
	 {
	   System.out.println(hills.get(i));
	 }
	}
}