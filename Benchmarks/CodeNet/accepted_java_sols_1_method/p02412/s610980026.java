import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String[] ar = br.readLine().split(" ");
            int x = Integer.parseInt(ar[0]);
            int y = Integer.parseInt(ar[1]);
            if(x == 0 && y == 0){ break;
            }
            int ans = 0;
            for(int i = 1; i <= x; i++){
                for(int j = 1; j <= x; j++){
                    if(i == j){break;
                    }
                    for(int k = 1; k <= x; k++){
                        if(i == k || j == k){ break;
                        }
                        if(i+j+k == y){
                            ans++;
                        }
                    }
                }
            }
            System.out.println(ans);
        }
    }
}