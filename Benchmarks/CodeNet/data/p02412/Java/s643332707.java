import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] num = new int[3];

        while(true){
            String[] line = br.readLine().split(" ");
            int n = Integer.parseInt(line[0]);
            int x = Integer.parseInt(line[1]);
            int cnt = 0;

            if(n == 0 && x == 0){
                break;
            }
            for(int i = 1; i <= n; i++){
                num[0] = i;
                for(int j = i+1; j <= n; j++){
                    num[1] = j;
                    for(int k = j+1; k <= n; k++){
                        num[2] = k;
                        if(num[0] + num[1] + num[2] == x){
                            cnt++;
                        }
                    }
                }
            }
            sb.append(cnt).append("\n");
        }
        System.out.print(sb.toString());
    }
}