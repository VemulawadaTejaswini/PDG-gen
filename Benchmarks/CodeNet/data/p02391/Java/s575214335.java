import java.io.*;
 
public class Main{
  public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        String[] spl=s.split(" ");
        int a=Integer.parseInt(spl[0]);
        int b=Integer.parseInt(spl[1]);
 
        if(a==b) System.out.println(a+"=="+b);
        else if(a>b) System.out.println(a+">"+b);
        else System.out.println(a+"<"+b);
    }
}