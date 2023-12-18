import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a = 0, b = 0, c = 0, d = 0;
        var key = new Scanner(System.in);
        var t = key.nextInt();
        for (int i = 0; i < t; i++) {
            String s = key.next();
            switch (s) {
                case "AC":
                    a++;
                    break;
                case "WA":
                    b++;
                    break;
                case "TLE":
                    c++;
                    break;
                case "RE":
                    d++;
                    break;
                default:
            }
        }
        System.out.println("AC x "+a);
        System.out.println("WA x "+b);
        System.out.println("TLE x "+c);
        System.out.println("RE x "+d);
    }
}
