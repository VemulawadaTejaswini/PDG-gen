import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] S = sc.next().toCharArray();
        String ans = "No";
        if(S[2] == S[3] && S[4] == S[5]) ans = "Yes";
        System.out.println(ans);
    }
}
