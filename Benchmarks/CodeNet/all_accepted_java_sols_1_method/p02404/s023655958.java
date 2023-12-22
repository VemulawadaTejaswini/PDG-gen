import java.io.*;
import java.util.ArrayList;
public class Main{
	public static void main(String args[]){
    int a=0,b=0,i=0,n=0;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    while(true){
    try{
      String line = reader.readLine();
      String[] splitted = line.split(" ");
      a = Integer.parseInt(splitted[0]);
      b = Integer.parseInt(splitted[1]);
      a++;
      if (b == 0) break;
		}catch(Exception e){
      break;
    }
    for(i = 1; i < a;i++){
      for(n = 0; n < b;n++){
        
        if (i == 1 || n == 0 || n == b-1 || i == a-1) {
          System.out.print("#");
        }else{
          System.out.print(".");
        }
      }
      System.out.print("\r\n");
    }
    System.out.print("\r\n");
  }
	}
}
