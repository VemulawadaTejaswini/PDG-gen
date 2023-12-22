
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException{
        String[] str;
        int n,x;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while((str = br.readLine().split(" ")) != null){
            n = Integer.parseInt(str[0]);
            x = Integer.parseInt(str[1]);

            if(n==0&&x==0){
                break;
            }

            int count=0;
            for(int i=1;i< n;i++){
                for(int j = i + 1; j < n; j++){
                    int num = x - i - j;
                    if(num > j && num <= n){
                        count++;
                    }
                }
            }
            System.out.println(count);
        }

        br.close();
    }
}