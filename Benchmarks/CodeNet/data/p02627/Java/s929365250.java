import java.io.BufferedReader;
import java.io.IOException;
import java.util.regex.Pattern;

import java.io.InputStreamReader;

public class Alphabet {

    public static void main(String[] args) {

        try(var br = new BufferedReader(new InputStreamReader(System.in))) {

            if(Pattern.matches("[A-Z]", br.readLine())){
                System.out.println("A");
            }else{
                System.out.println("a");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}