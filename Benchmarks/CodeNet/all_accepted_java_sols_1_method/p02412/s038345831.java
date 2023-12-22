import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str[];
        int n,x,count;
        StringBuilder sb = new StringBuilder();
        while(true){
            str = br.readLine().split(" ");
            n = Integer.parseInt(str[0]);
            x = Integer.parseInt(str[1]);
            if(n==0 && x==0) break;
            count = 0;
            for(int i=1;i<=n-2;i++){
                for(int j=i+1;j<=n-1;j++){
                    int k = x - i - j;
                    if(j < k && k <= n) count++;
                }
            }
            sb.append(count).append("\n");
        }
        System.out.print(sb);
    }
}