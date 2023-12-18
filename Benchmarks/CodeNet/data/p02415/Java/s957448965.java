import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char c[] = br.readLine().toCharArray();
        for(int i=0;i<c.length;i++){
            if(Character.isUpperCase(c[i])){
                c[i] = Character.toLowerCase(c[i]);
            }else{
                c[i] = Character.toUpperCase(c[i]);
            }
        }
        System.out.println(c);
    }
}