import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        char[] c = sc.next().toCharArray();
        int ans  =0;
        for (int i = 0 ; i < c.length ; i++) {
            if (c[i] == '+') {
                ans++;
            } else {
                ans--;
            }
        }
        System.out.println(ans);
    }

}
