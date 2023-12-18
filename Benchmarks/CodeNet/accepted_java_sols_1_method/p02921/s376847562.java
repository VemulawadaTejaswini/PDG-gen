import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char s[] = sc.next().toCharArray();
        char t[] = sc.next().toCharArray();
        int count = 0;
        for (int i = 0; i < 3; i++) {
            if (s[i] == t[i]) {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
