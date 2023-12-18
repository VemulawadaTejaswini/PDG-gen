import java.io.*;
import java.util.*;


public class Main {
  public static void main(String[] args) throws IOException {
      BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

      for(;;){
        String line = buf.readLine();
        int m = Integer.parseInt(line.split(" ")[0]);
        int f = Integer.parseInt(line.split(" ")[1]);
        int r = Integer.parseInt(line.split(" ")[2]);
        int mf = m+f;
        if((m==-1) && (f==-1) && (r==-1)){
          break;
        }else if((m==-1) ||(f==-1)){
          System.out.println("F");
        }else if(mf >= 80){
          System.out.println("A");
        }else if((65<=mf) && (mf<80)){
          System.out.println("B");
        }else if((50<=mf) && (mf<65)){
          System.out.println("C");
        }else if((30<=mf) && (mf<50)){
          if(r>=50){
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