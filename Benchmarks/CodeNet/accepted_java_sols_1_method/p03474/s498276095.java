import java.util.*;

public class Main {
        public static void main(String args[]) {
                Scanner sc = new Scanner(System.in);
                int A = sc.nextInt();
                int B = sc.nextInt();
                sc.nextLine();
                String S = sc.nextLine();
                String[] arStr = S.split("-");
                if (S.length() == A + B + 1 &&
                                arStr.length == 2 &&
                                arStr[0].length() == A &&
                                arStr[1].length() == B)
                {
                        System.out.println("Yes");
                } else {
                        System.out.println("No");
                }
        }
}
