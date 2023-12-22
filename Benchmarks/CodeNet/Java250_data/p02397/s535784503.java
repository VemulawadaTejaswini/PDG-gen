/*AOJ-ITP-3-3*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
 
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int x , y;
        
        while (true) {
        	String st[] = br.readLine().split(" ");
            x = Integer.parseInt(st[0]);
            y = Integer.parseInt(st[1]);
            if(x == 0 && y ==0){break;}
            sb.append(Integer.toString(x<y?x:y)).append(" ").append(Integer.toString(x<y?y:x)).append("\n");
        }
        System.out.print(sb);
    }
 
}