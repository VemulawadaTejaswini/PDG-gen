import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true){
            String line = br.readLine();
            //if (line == null) break;
            String[] ln = line.split(" ");
            int H = Integer.parseInt(ln[0]);
            int W = Integer.parseInt(ln[1]);
            //System.out.println(ln[0]+ln[1]);
            if (H==0 && W==0) break;
            //sb.delete(0,sb.length());
            for (int j=0; j<H; j++){    
                for (int i=0; i<W; i++){
                    sb.append("#");
                }
                sb.append("\n");
            }
            sb.append("\n");
        }
        System.out.println(sb);
        //System.out.println();
    }

}