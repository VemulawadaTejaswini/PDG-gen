import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args){
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        try{
        for(;;){
          String s = r.readLine();
          StringTokenizer st = new StringTokenizer(s," ");
          int a; int b; int t;
        a = Integer.parseInt(st.nextToken().toString());
        b = Integer.parseInt(st.nextToken().toString());
        if(a==0 && b==0){
          break;
        }else if(a<b){
          System.out.println(a + " " + b);
        }else{
          System.out.println(b + " " + a);
        }
      }
        }catch(IOException e){
            System.out.println(e);
        }
      }
    }