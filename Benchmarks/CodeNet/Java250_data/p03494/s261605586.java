import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int all = sc.nextInt();
        int[] valList = new int[all];
        for (int i = 0; i < all; i++) {
            valList[i] = sc.nextInt();
        }
        boolean isAllEven = true;
        int count = 0;
        while (isAllEven) {
            for (int i = 0; i < all; i++) {
                if (valList[i] % 2 == 0) {
                    valList[i] = valList[i] / 2;
                } else {
                    isAllEven = false;
                    break;
                }
            }
            if (isAllEven) {
                count++;
            }
        }
        System.out.println(count);
    }
}