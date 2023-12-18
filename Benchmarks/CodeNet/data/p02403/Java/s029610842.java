import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true){
            String str[] = br.readLine().split(" ");
            int h = Integer.parseInt(str[0]);
            int w = Integer.parseInt(str[1]);
            if(h==0 && w==0) break;
            for(int i=0;i<h;i++){
                for(int j=0;j<w;j++){
                    sb.append("#");
                }
                sb.append("\n");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}