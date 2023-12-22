    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;

    public class Main {

        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String [] line = br.readLine().split( " ");
            int n = Integer.parseInt(line[0]);
            int m = Integer.parseInt(line[1]);
            int sum = 0;
            String [] nums = br.readLine().split(" ");

            for(int i = 0 ; i< m; i++){
                sum += Integer.parseInt(nums[i]);
            }

            if(n-sum < 0){
                System.out.println("-1");
            }
            else {
                System.out.println(n-sum);
            }

        }
    }