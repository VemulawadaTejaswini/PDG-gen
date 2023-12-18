import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
 
        while(true){
            String line = input.readLine();
            String [] num = line.split(" ");
            int tate = Integer.parseInt(num[0]);
            int yoko = Integer.parseInt(num[1]);
 
            if(tate == 0 && yoko == 0) break;
 
            for(int i = 0 ; i < yoko ; i++){
                sb.append("#");
            }
            sb.append("\n");
            for(int j = 0 ; j < tate-2 ; j++){
                sb.append("#");
                for(int k = 0 ; k < yoko-2 ; k++){
                    sb.append(".");
                }
                sb.append("#\n");
            }
            for(int l = 0 ; l < yoko ; l++){
                sb.append("#");
            }
 
            sb.append("\n\n");
            }
        System.out.print(sb);
    }
 
}