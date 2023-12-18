    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;

    public class Main {

        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String []line = br.readLine().split(" ");

            long curr = Long.parseLong(line[0]), moves = Long.parseLong(line[1]), d = Long.parseLong(line[2]);

            for(; moves > 0; moves--){
                if(Math.abs(curr-d) <= Math.abs(curr+d)){
                    curr-=d;
                }
                else {
                    curr+=d;
                }
            }

            System.out.println(Math.abs(curr));
        }
    }

