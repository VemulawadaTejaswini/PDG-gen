import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] sList = sc.next().split("");

        for (int i = 1; i <= sList.length; i++) {
            if (i % 2 == 0) {
                if ("R".equals(sList[i-1])) {
                    System.out.println("No");
                    return;
                }
            } else {
                if ("L".equals(sList[i-1])) {
                    System.out.println("No");
                    return;
                }
            }
        }
        System.out.println("Yes");
    }
}