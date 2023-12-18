import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        String[] str = s.split("");
        int k = sc.nextInt();
        String target = str[k - 1];
        for (int i = 0; i < str.length; i++) {
            if (!target.equals(str[i])) {
                str[i] = "*";
            }
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length; i++) {
            result.append(str[i]);
        }
        System.out.println(result.toString());
    }

}
