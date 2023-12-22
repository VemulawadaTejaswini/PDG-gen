import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String c = sc.next();
        sc.close();
        int countR = 0;
        int answer = 0;
        for (int i = 0; i < n; i++) {
            if (c.charAt(i) == 'R') {
                countR++;
            }
        }
        for (int i = 0; i < countR; i++) {
            if (c.charAt(i) == 'W') {
                answer++;
            }
        }
        System.out.println(answer);
    }
}
