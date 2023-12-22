import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s[] = sc.next().split("");

        int result = 0;
        for (int i = 0; i < n-1; i++) {
            if (!s[i].equals(s[i+1])) {
                result++;
            }
        }

        System.out.println(result+1);
    }
}