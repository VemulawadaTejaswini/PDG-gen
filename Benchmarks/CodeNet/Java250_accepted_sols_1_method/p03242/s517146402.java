import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = String.valueOf(sc.nextInt());
        String res = "";
        for (int i = 0; i < 3; i++) {
            if (s.charAt(i) == '1') {
                res += "9";
            } else {
                res += "1";
            }
        }
        System.out.println(Integer.parseInt(res));
        sc.close();
    }
}