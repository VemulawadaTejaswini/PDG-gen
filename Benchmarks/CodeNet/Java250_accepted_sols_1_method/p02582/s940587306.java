    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;

    public class Main {

        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String line = br.readLine();

            if(line.contains("RRR")){
                System.out.println("3");
            }
            else if(line.contains("RR")){
                System.out.println("2");
            }
            else if(line.contains("R")){
                System.out.println(1);
            }
            else {
                System.out.println(0);
            }
        }
    }