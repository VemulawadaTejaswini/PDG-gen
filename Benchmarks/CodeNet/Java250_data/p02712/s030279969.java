import java.util.*;
import java.io.*;
public class Main
{
 static Hashtable<String ,Integer>hash=new Hashtable<>();
  public static void main(String args[]) throws java.lang.Exception
  {
    MyScanner sc = new MyScanner();
  
     //  hash=new Hashtable<>();

    int n=Integer.parseInt(sc.nextLine());
    long c=0;
    for(int k=1;k<=n;k++)
    {
      if(k%3==0 || k%5==0){}
        else{c+=(long)k;}
    }
    System.out.println(c);
      
       
     
     
   }
     
  
  

  
  }

   class MyScanner {
      BufferedReader br;
      StringTokenizer st;
 
      public MyScanner() {
         br = new BufferedReader(new InputStreamReader(System.in));
      }
 
      String next() {
          while (st == null || !st.hasMoreElements()) {
              try {
                  st = new StringTokenizer(br.readLine());
              } catch (IOException e) {
                  e.printStackTrace();
              }
          }
          return st.nextToken();
      }
 
      int nextInt() {
          return Integer.parseInt(next());
      }
 
      long nextLong() {
          return Long.parseLong(next());
      }
 
      double nextDouble() {
          return Double.parseDouble(next());
      }
 
      String nextLine(){
          String str = "";
    try {
       str = br.readLine();
    } catch (IOException e) {
       e.printStackTrace();
    }
    return str;
      }
 
   }