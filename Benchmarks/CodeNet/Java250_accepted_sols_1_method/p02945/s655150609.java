

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int aNum = sc.nextInt();
        int bNum = sc.nextInt();

        sc.close();

        int tasizan = aNum + bNum;
        int hikizan = aNum - bNum;
        int kakezan = aNum * bNum;

        int max = tasizan;
        if (max <= hikizan) {
            max = hikizan;
        }
        if (max <= kakezan) {
            max = kakezan;
        }

        System.out.println(max);
    }
}