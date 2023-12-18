import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// ??\????????????????????????
            StringBuilder st = new StringBuilder();

            long i = 1;
            while(true) {
            	int line = Integer.parseInt(br.readLine());
            	if(line == 0) {
            		break;
            	}
            	st.append("Case ").append(i).append(": ").append(line).append("\n");
                i++;
            }
            System.out.print(st);
    }
}