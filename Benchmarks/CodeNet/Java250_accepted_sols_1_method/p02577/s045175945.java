import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
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


