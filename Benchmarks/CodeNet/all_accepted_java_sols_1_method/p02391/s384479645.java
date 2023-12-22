import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String line = br.readLine();
            StringTokenizer st = new StringTokenizer(line, " ");
            StringBuilder str = new StringBuilder();

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            if(x < y) {
            	System.out.println("a < b");
            }
            else if(x > y) {
            	System.out.println("a > b");
            }
            else {
            	System.out.println("a == b");
            }
    }
}