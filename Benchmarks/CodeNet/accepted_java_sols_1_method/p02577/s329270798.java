import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int sum = 0;
        for(int i=0; i<n.length(); i++) {
            sum += Integer.parseInt(String.valueOf(n.charAt(i)));
        }
        String ans = "";
        if (sum % 9 == 0) ans = "Yes";
        else ans = "No";

        System.out.println(ans);
    }
}