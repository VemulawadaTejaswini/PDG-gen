import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            char[] l = sc.nextLine().toCharArray();
            char a = 'd';
            for (int i = 0; i < 3; i++) {
                if (l[i * 3] != 's' && l[i * 3] == l[i * 3 + 1] && l[i * 3 + 1] == l[i * 3 + 2]) {
                    a = l[i * 3];
                    break;
                }
                if (l[i] != 's' && l[i] == l[i + 3] && l[i + 3] == l[i + 6]) {
                    a = l[i];
                    break;
                }
            }
            if (l[4] != 's' && (l[0] == l[4] && l[4] == l[8] || l[2] == l[4] && l[4] == l[6])) {
                a = l[4];
            }
            System.out.println(a);
        }
    }
}

