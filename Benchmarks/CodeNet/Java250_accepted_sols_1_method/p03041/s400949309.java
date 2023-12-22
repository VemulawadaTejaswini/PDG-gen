import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        String s = sc.next();
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String a = String.valueOf(s.charAt(i));
            if ((i + 1) == k) {
                a = a.toLowerCase();
            }
            answer.append(a);
        }
        System.out.println(answer);
        sc.close();
    }
}