import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        String T = sc.next();
        int L;

        L = S.length();

        if(T.substring(0,L).equals(S)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}