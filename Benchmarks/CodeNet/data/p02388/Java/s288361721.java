import java.io.*;
      
public class Main{
    public static void main(String[] args) throws Exception{
        int x, ans;
 
        BufferedReader br = new BufferedReader(new InputStremaReader(System.in));
        x = Integer.parseInt(br.readLine);

        ans = x*x*x;
        System.out.println(ans);              
    }
}