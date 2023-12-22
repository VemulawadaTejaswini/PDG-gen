import java.io.*;

class Main{
public static void main(String args[]){
       
       int x;
       String buf;

       try{

       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       buf=br.readLine();

       
       x=Integer.parseInt(buf);
       System.out.println(x*x*x);
       }catch(Exception e){
             
       }
}
}
