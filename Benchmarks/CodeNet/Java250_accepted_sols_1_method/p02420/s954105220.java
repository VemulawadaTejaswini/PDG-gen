import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        StringBuilder sb = new StringBuilder();
        while(!(str = br.readLine()).equals("-")){
            int m = Integer.parseInt(br.readLine());
            while(m-->0){
                int h = Integer.parseInt(br.readLine());
                str = str.substring(h) + str.substring(0,h);
            }
            sb.append(str).append("\n");
        }
        System.out.print(sb);
    }
}