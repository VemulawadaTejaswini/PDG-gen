import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        int count = 0, max = 0;
        for (int i = 0; i < 3; i++) {
            if (s.charAt(i) == 'R') {
                count++;
                if (max < count) {
                    max = count;
                }
            } else {
                if (max < count) {
                    max = count;
                }
                count = 0;
            }
        }
        System.out.println(max);
    }
}
