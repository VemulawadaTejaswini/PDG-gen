import java.util.Scanner;

/**
 * @author subaru
 */
public class Main {
    // Coloring Colorfully
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int count0first = 0;
        int count1first = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '1' && i % 2 == 0) {
                count0first++;
            } else if (S.charAt(i) == '0' && i % 2 == 1) {
                count0first++;
            }
            if (S.charAt(i) == '0' && i % 2 == 0) {
                count1first++;
            } else if (S.charAt(i) == '1' && i % 2 == 1) {
                count1first++;
            }

        }
        System.out.println(Math.min(count0first, count1first));
    }
}
