
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int week = scan.nextInt();
        double debt = 100000;
        for(int i = 0; i < week; i++) {
            debt *= 1.05;
        }
        int ans = (int)(debt * 0.0001 + 0.999)*10000;
        System.out.println(ans);
    }
}