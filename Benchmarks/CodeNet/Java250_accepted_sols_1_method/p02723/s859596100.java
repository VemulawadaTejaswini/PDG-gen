import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine().toLowerCase();
        int a = s.length();
        boolean flag = false;

            for (int i = 3; i < a; i+=2) {
                if (s.charAt(i)==s.charAt(i-1)) {
                    flag = true;
                }else {
                    flag = false;
                    break;
                }
            }

        if (flag==false){
            System.out.println("No");
        }else {
            System.out.println("Yes");
        }
    }
}
