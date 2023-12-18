import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String nn = Integer.toString(n);
        int a = Integer.parseInt(String.valueOf(nn.charAt(nn.length()-1)));
        String ans = "";
        if (a == 3) ans = "bon";
        else if (a == 0 || a == 1 || a == 6 || a == 8) {
            ans = "pon";
        }
        else {
            ans = "hon";
        }
        System.out.println(ans);
    }
}
