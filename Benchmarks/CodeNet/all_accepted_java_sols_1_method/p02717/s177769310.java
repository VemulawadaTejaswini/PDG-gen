import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringJoiner;

public class Main{
    public static void main(String[] args) throws IOException{
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String input = bufferedReader.readLine();
        String inputs[] = input.split(" ");
        String result = String.join(" ", inputs[2], inputs[0], inputs[1]);
        System.out.println(result);
    }
}