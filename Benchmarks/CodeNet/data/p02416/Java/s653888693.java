import java.io.*;
import java.util.ArrayList;
public class Main{
	public static void main(String args[]){
    int a=0,b=0,c=0,i=0,n=0;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    while(true){
      a = 0;
    try{
      String line = reader.readLine();
      if (line.equals("0")) break;
      for(String splitted: line.split("")){
        a += Integer.parseInt(splitted);
      }
      
		}catch(Exception e){
      System.out.println("error");
      break;
    }

    System.out.println(a);

  }
	}
}
