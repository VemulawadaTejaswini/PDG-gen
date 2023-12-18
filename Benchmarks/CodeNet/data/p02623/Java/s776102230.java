import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int limit = sc.nextInt();

        int[] aList = new int[a];
        int[] bList = new int[b];
        aList[0] = sc.nextInt();
        for (int i = 1; i < a; i++) aList[i] = sc.nextInt() + aList[i-1];
        bList[0] = sc.nextInt();
        for (int i = 1; i < b; i++) bList[i] = sc.nextInt() + bList[i-1];
      
        int count = 0;
        int j = b-1;
        for (int i = 0; i < a; i++) {
            if (aList[i] > limit) {
                break;
            }

            while (bList[j] > limit - aList[i]) {
                j--;
            }
            count = Math.max(count, i+1 + j+1);
        }
        System.out.println(count);
    }
}