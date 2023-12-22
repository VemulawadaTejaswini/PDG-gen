import java.io.*;
import java.util.ArrayList;
public class Main{
	public static void main(String args[]){
    int a=0,end = 0;
    String ans;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    try{
      String line = reader.readLine();
      ans = line;
      
      while (true) {
        line = reader.readLine();
        for(String splitted: line.split(" ")){
           if (ans.equalsIgnoreCase(splitted)) a++;
           if (splitted.equals("END_OF_TEXT")) end = 1;
        }
        if(end == 1) break;
      }
      
		}catch(Exception e){
    }
  System.out.println(a);

  }
}
