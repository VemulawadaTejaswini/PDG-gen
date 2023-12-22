import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();

        for(char c='a'; c<='z'; c++) {
            if(!s.contains(Character.toString(c))) {
                System.out.println(c);
                System.exit(0);
            }
        }
        System.out.println("None");
    }
}
