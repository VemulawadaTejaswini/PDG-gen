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
            int[] in = new int[input.length];
            
            // ??????????????°????????????
            for(int i = 0; i < input.length; i++) {
                in[i] = Integer.parseInt(input[i]);
            }
            
            // ?????????????????????????????????
            for(int i = 0; i < in.length-1; i++) {
                for(int j = in.length - 1; j > i; j--) {
                    if(in[j] < in[j-1]) {
                        int temp = in[j];
                        in[j] = in[j-1];
                        in[j-1] = temp;
                    }
                }
            }
            String out = "";
            for(int k = 0; k < in.length; k++) {
                out += in[k] + " ";
            }
            System.out.println(out.substring(0, out.length()-1));
        }
    }
}