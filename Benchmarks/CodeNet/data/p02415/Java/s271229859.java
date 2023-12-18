import java.util.Scanner;

import static java.lang.Character.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        char[] output = new char[input.length()];

        for(int i = 0; i < input.length(); i++){
            if(isLowerCase(input.charAt(i)))
                output[i] = toUpperCase(input.charAt(i));
            else if(isUpperCase(input.charAt(i)))
                output[i] = toLowerCase(input.charAt(i));
            else output[i] = input.charAt(i);
        }

        System.out.println(output);

        sc.close();
    }
}
