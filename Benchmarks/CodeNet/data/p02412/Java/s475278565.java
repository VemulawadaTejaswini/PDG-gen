import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            while(true){
                String str = reader.readLine();
                String[] split = str.split(" ");
                int n = Integer.parseInt(split[0]);
                int x = Integer.parseInt(split[1]);
                if(n == 0 && x == 0){
                    break;
                }
                int count = 0;
                for(int i = 1; i <= n; i ++){
                    for(int j = i+1; j <= n; j++){
                        for(int k = j+1;k<=n;k++){
                            if(i!=j && j!=k && k!=i){
                                int sum = i + j + k;
                                if(sum == x){
                                    count += 1;
                                }
                            }
                        }
                    }
                }
                System.out.println(count);
            }
        }catch(IOException e){

        }
    }
}
