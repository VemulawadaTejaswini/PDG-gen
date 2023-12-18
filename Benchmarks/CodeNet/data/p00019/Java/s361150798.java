import java.io.*;
class Main {
    public static void main(String[] args) {
        try {
           BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
           int n = Integer.parseInt(reader.readLine());
           int fact = 1;
           for(int i = n;i >= 1;i--) {
                fact *= i;
           }
           System.out.println(fact);
         }
         catch(IOException e) {
          System.out.println(e);
         }
    }
}