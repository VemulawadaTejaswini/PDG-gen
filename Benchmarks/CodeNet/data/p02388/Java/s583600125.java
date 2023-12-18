import java.io.*;

class Main {
   public static void main(String[] args)throws java.io.IOException  {
   int x;
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   x = Integer.parseInt(br.readLine());
   x = x * x * x;
   System.out.println(x);
}
}