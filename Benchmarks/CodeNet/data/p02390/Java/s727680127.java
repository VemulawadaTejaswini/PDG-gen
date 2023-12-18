
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Main{
  public static void main(String[] args)throws IOException{
     
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
 
        int x=Integer.parseInt(str);
        int h=x/3600;
        int m=x%3600/60;
        int s=x%3600%60;
 
    System.out.println(h+":"+m+":"+s);
  }
}