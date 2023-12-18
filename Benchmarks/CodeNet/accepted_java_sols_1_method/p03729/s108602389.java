
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String A, B, C;

        Scanner input = new Scanner(System.in);

        A = input.next();
        B = input.next();
        C = input.next();

        int lengthA = A.length();
        int lengthB = B.length();
        int len3 = C.length();

        char Astringlastchar = A.charAt(lengthA - 1);

        char Bstringfirstchar = B.charAt(0);

        char Bstringlastchar = B.charAt(lengthB - 1);

        char Cstringfirstchar = C.charAt(0);

        if (Astringlastchar == Bstringfirstchar && Bstringlastchar == Cstringfirstchar) {

            System.out.println("YES");
        } else {

            System.out.println("NO");
        }

    }
}
