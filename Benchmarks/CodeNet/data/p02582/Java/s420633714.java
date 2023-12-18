import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean rainflg = false;
        int answer = 0;
        for (int i = 0; i < 3; i++) {
            if (s.charAt(i) == 'R') {
                answer++;
                rainflg = true;
            } else {
                if (rainflg) {
                    break;
                }
            }
        }
        System.out.println(answer);
        sc.close();
    }
}