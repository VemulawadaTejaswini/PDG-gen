import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        String res = "";
        for (char c : num.toCharArray()) {
            if (c == '1') res += "9";
            else if (c == '9') res += "1";
            else res += c;
        }
        System.out.println(res);
    }
}