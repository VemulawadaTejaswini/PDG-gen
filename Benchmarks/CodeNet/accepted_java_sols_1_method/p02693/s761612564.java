    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;

    public class Main {

        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int K = Integer.parseInt(br.readLine());
            String [] l = br.readLine().split(" ");
            int A = Integer.parseInt(l[0]);
            int B = Integer.parseInt(l[1]);

            if(A%K == 0 || B%K == 0){
                System.out.println("OK");
            }
            else {
                int x = A/K + 1;
                if((x*K) > B){
                    System.out.println("NG");
                }
                else {
                    System.out.println("OK");
                }
            }
        }
    }