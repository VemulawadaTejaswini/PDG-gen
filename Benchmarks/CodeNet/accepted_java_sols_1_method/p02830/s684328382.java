import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String S = sc.next();
        String T = sc.next();

        String[] Sarray = S.split("", 0);
        String[] Tarray = T.split("", 0);

        String ans = "";

        for (int i = 0; i < n; i++) {
            ans = ans + Sarray[i]; 
            ans = ans + Tarray[i];
        }

        System.out.println(ans);
    }
}