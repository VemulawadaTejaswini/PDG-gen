import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] S = str.split("");
        String str2 = sc.nextLine();
        String[] T = str2.split("");
        int c = 0;
        for (int i = 0; i < S.length; i++) {
            if ( S[i].equals(T[i]) ) {
                c = c;
            } else {
                c = c+1;
            }
        }
        System.out.println(c);
    }
}