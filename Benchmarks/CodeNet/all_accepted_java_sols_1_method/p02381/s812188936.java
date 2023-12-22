import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n;
        String str[];
        StringBuilder sb = new StringBuilder();
        while((n = Integer.parseInt(br.readLine()))!=0){
            str = br.readLine().split(" ");
            int score[] = new int[n];
            double m = 0,alpha = 0;
            for(int i=0;i<n;i++){
                score[i] = Integer.parseInt(str[i]);
                m += score[i];
            }
            m = m / n;
            for(int i=0;i<n;i++){
                alpha += Math.pow(score[i]-m, 2);
            }
            alpha = alpha / n;
            sb.append(String.format("%.8f", Math.sqrt(alpha))).append("\n");
        }
        System.out.print(sb);
    }
}