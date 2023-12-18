import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {

        static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        public static void main(String[] args) throws Exception{

            int[] cnts = new int[51];

            for (int i=0; i<10; i++) {
                for (int j=0; j<10; j++) {
                    for (int k=0; k<10; k++) {
                        for (int l=0; l<10; l++) {
                            int sum = i + j + k + l;
                            cnts[sum]++;
                        }
                    }
                }
            }

            String s = "";
            while ((s = reader.readLine()) != null) {
                System.out.println(cnts[Integer.parseInt(s)]);
            }

        }

}