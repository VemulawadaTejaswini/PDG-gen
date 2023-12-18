import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true){
            String line = br.readLine();
            String[] ln = line.split(" ");
            int H = Integer.parseInt(ln[0]);
            int W = Integer.parseInt(ln[1]);
            if (H==0 && W==0) break;
            for (int j=0; j<H; j++){
                if (j%2==0){
                    for (int i=0; i<W; i++){
                        if (i%2==0) sb.append("#");
                        else sb.append(".");
                    }
                }else{
                    for (int i=0; i<W; i++){
                        if (i%2==0) sb.append(".");
                        else sb.append("#");
                    }
                }
                sb.append("\n");
            }
            sb.append("\n");
        }
        StringBuilder k = new StringBuilder(100);
        System.out.print(k);
        System.out.print(sb);
    }
}