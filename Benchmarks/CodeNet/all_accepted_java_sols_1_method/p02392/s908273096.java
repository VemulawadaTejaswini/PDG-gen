import java.io.*;

public class Main{
  public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        String[] spl=s.split(" ");
        int a=Integer.parseInt(spl[0]);
        int b=Integer.parseInt(spl[1]);
        int c=Integer.parseInt(spl[2]);
 
        if(a<b&&b<c) System.out.println("Yes");
        else System.out.println("No");
    }
}