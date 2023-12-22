import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = Integer.parseInt(sc.next());
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int ashikiri = a + b;
        String s = sc.next();
        char list[] = s.toCharArray();
        int total_pass = 0;
        int foreigner_rank = 0;
        for (int i = 0; i < total; i++) {
            if (list[i] == 'a') {
                if (total_pass < ashikiri) {
                    total_pass++;
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            } else if (list[i] == 'b') {
                foreigner_rank++;
                if ((total_pass < ashikiri) && (foreigner_rank <= b)) {
                    total_pass++;
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            } else {
                System.out.println("No");
            }
        }
        sc.close();
    }

}