import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] s = sc.next().toCharArray();
        int needLeft = 0;
        int pointer = 0;
        for (int i = 0; i < n; i++) {
            if (s[i] == '(') {
                pointer++;
            } else {
                if (pointer == 0) {
                    needLeft++;
                } else {
                    pointer--;
                }
            }
        }
        int needRight = pointer;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < needLeft; i++) {
            sb.append('(');
        }
        sb.append(s);
        for (int i = 0; i < needRight; i++) {
            sb.append(')');
        }
        System.out.println(sb);
    }

}
