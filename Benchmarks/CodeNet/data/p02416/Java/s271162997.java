import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while((line = br.readLine()) != null){
            if(line.equals("0")) break;

            int num = Integer.parseInt(line);
            int keta = (int)Math.log10(num) + 1;
            int result = 0;

            for(int i = 1; i <= keta; i++){
                result += num % 10;
                num /= 10;
            }

            System.out.println(result);
        }
    }
}