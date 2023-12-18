import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        for(char c: string.toCharArray()){
            if(Character.isUpperCase(c)) System.out.println(Character.toLowerCase(c));
            else System.out.println(Character.toUpperCase(c));
        }
    }
}