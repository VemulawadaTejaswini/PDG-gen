import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        // Here your code !
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();
        while(true) {
            String input = br.readLine();
            String param[] = input.split(" ");
            int x = Integer.parseInt(param[0]);
            int y = Integer.parseInt(param[1]);
            if(x == 0 && y == 0){
                break;
            }
            int max = Math.max(x, y);
            int min = Math.min(x, y);
            builder.append(min).append(" ").append(max).append("\n");
            
        }
        
        System.out.println(builder);
    }
}