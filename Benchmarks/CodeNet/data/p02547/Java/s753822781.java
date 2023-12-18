import java.util.Scanner;

//atcoderはScannerクラスのsc.next()で行ける
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int flagcnt = 0;
        boolean befor = false;
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            if (flagcnt >= 3) {
                flag = true;
                break;
            }
            int i1 = sc.nextInt();
            int i2 = sc.nextInt();
            if (i1 == i2) {
                if (!befor) {
                    flagcnt = 1;
                    befor = true;
                } else {
                    flagcnt++;
                    befor = true;
                }
            } else {
                flagcnt = 0;
                befor = false;
            }
        }
        if (flag) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}