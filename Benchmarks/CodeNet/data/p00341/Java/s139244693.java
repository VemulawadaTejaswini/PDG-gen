
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t[] = new int[12];
        for (int i = 0; i < 12; i++) {
            t[i] = scan.nextInt();
        }
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11 - i; j++) {
                if (t[j] < t[j + 1]) {
                    int temp = t[j];
                    t[j] = t[j + 1];
                    t[j + 1] = temp;
                }
            }
        }
        if (t[0] == t[1] && t[1] == t[2] && t[2] == t[3] && t[4] == t[5] && t[5] == t[6] && t[6] == t[7]
                && t[8] == t[9] && t[9] == t[10] && t[10] == t[11]) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}

