import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(Character.isUpperCase(str.charAt(i))){
                sb.append(str.substring(i,i+1).toLowerCase());
            }else{
                sb.append(str.substring(i,i+1).toUpperCase());
            }
        }
        sb.append("\n");
        System.out.print(sb);
    }
}