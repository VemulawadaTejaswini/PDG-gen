import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] wArr = new int[10];
        int[] kArr = new int[10];
        for (int i = 0; i < 10; i++) {
            wArr[i] = - sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            kArr[i] = - sc.nextInt();
        }
        Arrays.sort(wArr);
        Arrays.sort(kArr);
        int wTotal = 0;
        int kTotal = 0;
        for (int i = 0; i < 3; i++) {
            wTotal -= wArr[i];
            kTotal -= kArr[i];
        }
        System.out.println(wTotal + " " + kTotal);
    }
}

