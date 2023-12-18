
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int week = scan.nextInt();
        int debt = 100000;
        for(int i = 0; i < week; i++) {
            debt *= 1.05;
            debt = (int)(debt * 0.001 + 0.999) * 1000;
        }
        System.out.println(debt);
    }
}