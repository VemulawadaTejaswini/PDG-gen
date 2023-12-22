import java.io.*;
import java.util.ArrayList;
public class Main{
	public static void main(String args[]){
    int a=0,b=0,c=0,i=0,n=0;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    while(true){
    try{
      String line = reader.readLine();
      String[] splitted = line.split(" ");
      a = Integer.parseInt(splitted[0]);
      b = Integer.parseInt(splitted[1]);
      c = Integer.parseInt(splitted[2]);
      if (a+b+c == -3) break;
		}catch(Exception e){
      break;
    }

    if (a == -1 || b == -1) {
      System.out.println("F");
    }else if (a + b >= 80){
      System.out.println("A");
    }else if (a + b >= 65){
      System.out.println("B");
    }else if (a + b >= 50){
      System.out.println("C");
    }else if (a + b >= 30){
      if (c >= 50) {
        System.out.println("C");
      }else{
        System.out.println("D");
      }
    }else{
      System.out.println("F");
    }

  }
	}
}
