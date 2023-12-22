import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str[];
        StringBuilder sb = new StringBuilder();
        int result;
        while(true){
            str = br.readLine().split("");
            if(str[0].equals("0")) break;
            result = 0;
            for(String str1 : str){
                result += Integer.parseInt(str1);
            }
            sb.append(result).append("\n");
        }
        System.out.print(sb);
    }
}