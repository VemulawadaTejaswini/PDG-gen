import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            String s = sc.next();

            int ans = 0;
            for (int i = 1; i < n; i++) {
                String str1 = s.substring(0, i);
                String str2 = s.substring(i);
                int counter = 0;
                for (char ch = 'a'; ch <= 'z'; ch++) {
                    if (str1.indexOf(ch) != -1 && str2.indexOf(ch) != -1) {
                        counter++;
                    }
                }
                if (counter > ans) {
                    ans = counter;
                }
            }
            System.out.println(ans);
        }
    }

}
