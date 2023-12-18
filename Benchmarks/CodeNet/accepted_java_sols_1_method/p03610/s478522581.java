import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] charArr = sc.next().toCharArray();

        for (int i = 0; i < charArr.length; i++) {
            if ((i + 1) % 2 != 0) System.out.print(charArr[i]);
        }
    }
}
