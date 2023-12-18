import java.awt.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int D=scan.nextInt();
        int T=scan.nextInt();
        int S=scan.nextInt();
        if (D >= 10000 || T >= 10000 || S >= 10000) {
            System.out.println("Error");
        }
        else{
            if ((D / S) <= T) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}