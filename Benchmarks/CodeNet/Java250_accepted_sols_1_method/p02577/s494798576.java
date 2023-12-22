import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        int numberDigitTotal = 0;

        for(int i = 0; i < s.length(); i++)
        {
            numberDigitTotal += Integer.parseInt(s.substring(i,i + 1));
        }

        if(numberDigitTotal % 9 != 0)
        {
            System.out.println("No");
        }
        else
        {
           System.out.println("Yes");
        }
    }
}