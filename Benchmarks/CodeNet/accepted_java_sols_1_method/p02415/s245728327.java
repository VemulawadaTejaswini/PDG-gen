import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        sb.append(br.readLine());
        for(int i=0;i<sb.length();i++){
            if(Character.isUpperCase(sb.charAt(i))){
                sb.replace(i,i+1,sb.substring(i,i+1).toLowerCase());
            }else{
                sb.replace(i,i+1,sb.substring(i,i+1).toUpperCase());
            }
        }
        sb.append("\n");
        System.out.print(sb);
    }
}