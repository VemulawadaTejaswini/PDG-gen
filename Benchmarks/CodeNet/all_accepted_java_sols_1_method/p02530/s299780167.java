import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
       
        static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        public static void main(String[] args) throws Exception{
        
            int n = Integer.parseInt(reader.readLine());

            int t_val = 0;
            int h_val = 0;

            while(n-- > 0) {
                String[] s = reader.readLine().split(" ");
                
                String tarou = s[0];
                String hanako = s[1];

                float result = tarou.compareTo(hanako);
                if (result == 0.0) {
                    t_val += 1;
                    h_val += 1; 
                } else if (result > 0) {
                    t_val += 3;
                } else if (result < 0) {
                    h_val += 3;
                } 

            }

            System.out.println(t_val + " " + h_val);

        }

}