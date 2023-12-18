import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {

        static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        public static void main(String[] args) throws Exception{
        
            String row; 
            while ((row = reader.readLine()) != null) {
                int n = Integer.parseInt(row);
                
                int cnt;
                if (n < 3) {
                    cnt = 2 * n;
                } else {
                    cnt = 4 + (n-2) * 3;
                }

                System.out.println(cnt);
            }

        }

}