import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
    
        BufferedReader std = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(std.readLine());
        StringBuilder input = new StringBuilder();
        
        int num = 0;
        
        for(int j = 3; j <= n; j++){
            if(j % 3 == 0){
                input.append(" "+j);
            } else {
                num = j;
                while(num != 0) {
                    if(num %10 == 3){
                        input.append(" "+j);
                        break;
                    } else {
                        num = num /10;
                    }
                }
            }
        }
    }

}