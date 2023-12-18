import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        String s;
        if (n < 10) {
            switch (n) {
                case 3:
                    s = "bon";
                    break;
                case 0:
                case 1:
                case 6:
                case 8:
                    s ="pon";
                    break;
                default:
                    s = "hon";
                    break;
            }
        } else if (n >= 10 && n < 100) {
            switch (n % 10) {
                case 3:
                    s = "bon";
                    break;
                case 0:
                case 1:
                case 6:
                case 8:
                    s ="pon";
                    break;
                default:
                    s = "hon";
                    break;
            }
        } else {
            switch ((n % 100) % 10) {
                case 3:
                    s = "bon";
                    break;
                case 0:
                case 1:
                case 6:
                case 8:
                    s ="pon";
                    break;
                default:
                    s = "hon";
                    break;
            }
        }
        
        System.out.println(s);
    }
}