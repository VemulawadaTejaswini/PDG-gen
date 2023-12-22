import java.util.Scanner;

public class Main {

    private static int sum(int aNum, int bNum, int cNum, int k) {
        int sum = 0;
        if (k <= aNum) {
            return k;
        } else {
            sum += aNum;
            k -= aNum;
        }

        if (k <= bNum) {
            return sum;
        } else {
            k -= bNum;
        }

        return sum + Math.min(k, cNum) * -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aNum = sc.nextInt(), bNum = sc.nextInt(), cNum = sc.nextInt(), k = sc.nextInt();

        System.out.println(sum(aNum, bNum, cNum, k));
        sc.close();
    }
}
