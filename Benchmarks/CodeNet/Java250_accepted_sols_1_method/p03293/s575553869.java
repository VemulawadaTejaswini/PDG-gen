import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();

        String[] Sarr = new String[S.length()];
        for (int i = 0; i < S.length(); i++) {
            Sarr[i] = S.substring(i) + S.substring(0,i);
        }

        boolean result = false;
        for (int i = 0; i < S.length(); i++) {
            if(Sarr[i].equals(T)){
                result = true;
                break;
            }
        }
        System.out.println(result ? "Yes":"No");

    }
}
