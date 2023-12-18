import java.io.*;

class Main {
   int x;
   public static void main(String[] args) {
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   x = Integer.parseInt(br.readLine());
   x = x * x * x;
   System.out.println(x);
}
}