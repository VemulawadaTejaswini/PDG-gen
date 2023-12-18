        import java.io.*;
        import java.util.*;
        public class Main{
          public static void main(String[] args) throws IOException{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(reader.readLine());
            int K = Integer.parseInt(reader.readLine());
            int X = Integer.parseInt(reader.readLine());
            int Y = Integer.parseInt(reader.readLine());
            if((N-K)>0) System.out.println(K*X+(N-K)*Y);
            else System.out.println(N*X);
          }}