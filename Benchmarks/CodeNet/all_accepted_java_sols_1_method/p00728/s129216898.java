import java.io.*;
import java.util.ArrayList;
public class Main{
	public static void main(String args[]){
    int a=0,b=0,c=0,d=1000,z=0,i=0,n=0,m=0;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    



    while(true){
    try{
      z = 0;
      c = 0;
      d = 1000;
      String line = reader.readLine();
      a = Integer.parseInt(line);
      if (a == 0) break;
      for(i=0;i<a;i++){
        line = reader.readLine();
        b = Integer.parseInt(line);
        if (b > c) c = b;
        if (b < d) d = b;
        z += b;
      }
      System.out.println((z - c - d)/(a - 2));



		}catch(Exception e){
      break;
    }





  }



  
	}
}
