import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (sc.hasNext()) {
            char[] n = sc.next().toCharArray();
            for (int i = 0; i < n.length / 2; i++) {
                if (n[i] != n[n.length - i - 1]) {
                    count--;
                    break;
                }
            }
            count++;
        }
        System.out.println(count);
    }
}
