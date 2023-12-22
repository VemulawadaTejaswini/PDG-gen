import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String line;
        // ????????\???
        while((line=br.readLine()) != null) {
            // ??\???????????????????§???????????????§????????????
            String[] input = line.split(" ");
            int[] in = new int[2];
            in[0] = Integer.parseInt(input[0]);
            in[1] = Integer.parseInt(input[1]);
            
            if(in[0] > in[1]) {
                System.out.println("a > b");
            } else if(in[0] < in[1]) {
                System.out.println("a < b");
            } else {
                System.out.println("a == b");
            }
            
        }
    }
}