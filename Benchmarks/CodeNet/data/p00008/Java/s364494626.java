import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {

        static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        public static void main(String[] args) throws Exception{

            while (true) {

                int n = Integer.parseInt(reader.readLine());
                int cnt = 0;

                for (int i=0; i<10; i++) {
                    if (i > n) break;
                    for (int j=0; j<10; j++) {
                        if (i + j > n) break;
                        for (int k=0; k<10; k++) {
                            if (i + j + k > n) break;
                            for (int l=0; l<10; l++) {
                                if (i + j + k + l > n) break;
                                int sum = i + j + k + l;
                                if (n == sum) cnt++;
                            }
                        }
                    }
                }
                System.out.println(cnt);
            }

        }

}