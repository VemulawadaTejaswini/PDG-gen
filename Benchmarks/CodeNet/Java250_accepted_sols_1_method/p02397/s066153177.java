import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int x,y,temp;
        while(true){
            String str[] = br.readLine().split(" ");
            x = Integer.parseInt(str[0]);
            y = Integer.parseInt(str[1]);
            if(x == 0 && y == 0) break;
            if(x > y){
                temp = y;
                y = x;
                x = temp;
            }
            sb.append(Integer.toString(x)).append(" ").append(Integer.toString(y)).append("\n");
        }
        System.out.print(sb);
    }
}