import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
 
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String[] st = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();
        int x , y;
        
        while (true) {
            x = Integer.parseInt(st[0]);
            y = Integer.parseInt(st[1]);
            if(x == 0 && y ==0){break;}
            if(x > y){
            	 sb.append(y).append(" ").append(x).append("\n");
            }else{
            	sb.append(x).append(" ").append(y).append("\n");
            }
        }
        System.out.print(sb);
    }
 
}