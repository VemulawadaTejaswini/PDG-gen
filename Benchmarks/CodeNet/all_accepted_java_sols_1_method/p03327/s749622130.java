import java.io.*;

class Main {
        public static void main(String[] args) throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                int n = Integer.parseInt(br.readLine());
                
                if(n < 1000)
                        System.out.println("ABC");
                else
                        System.out.println("ABD");
        }
}
