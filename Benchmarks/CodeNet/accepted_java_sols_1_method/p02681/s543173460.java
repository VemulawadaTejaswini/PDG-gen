import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        String S = scan.next();
        String T = scan.next();

        if (S.contains(T.substring(0, S.length())) && T.length() == S.length() + 1 && S.length() <= 10 &&
                S.length() >= 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}