import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        String T = sc.next();

        //String lastChar = Character.toString(T.charAt(S.length()));

        String Tmatch=T.substring(0, S.length());

        //String str = T.substring(S.length());
        //System.out.println(str);
        if (Tmatch.equals(S) ){//&& str.equals(lastChar)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}