import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        char[] str = input.toCharArray();

        for(int i = 0; i < str.length; i++){
            if(Character.isUpperCase(str[i])){
                str[i] = Character.toLowerCase(str[i]);
            }else{
                str[i] = Character.toUpperCase(str[i]);
            }
        }
        System.out.println(str);
    }
}