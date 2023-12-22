import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] input = sc.next().toCharArray();
        for (int i = 0; i < input.length; i++) {
            if (input[i] == '1')
                System.out.print('9');
            else
                System.out.print('1');
        }
        System.out.println("");
        
    }
}