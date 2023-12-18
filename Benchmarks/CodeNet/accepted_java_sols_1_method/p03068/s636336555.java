import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();
        int k = sc.nextInt();

        String str1 = String.valueOf(s.charAt(k-1));
        String replaced = s;

        for (int i = 0; i < n; i++) {
            String str2 = String.valueOf(s.charAt(i));
            if (!str2.matches(str1)){
                replaced = replaced.replace(str2,"*");
            }
        }

        System.out.println(replaced);

        sc.close();
    }
}