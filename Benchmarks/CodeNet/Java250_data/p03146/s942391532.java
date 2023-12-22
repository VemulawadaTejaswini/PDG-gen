import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();
        int[] a = new int[1000010];
        a[0] = s;
        boolean isLoop = false;
        for (int i = 1; i < a.length; i++) {
            if (a[i-1] % 2 == 0) {
                a[i] = a[i-1] / 2;
            } else {
                a[i] = 3 * a[i-1] + 1;
            }
            
            for (int j = 0; j < i; j++) {
                if (a[j] == a[i]) {
                    isLoop = true;
                    System.out.println(i+1);
                }
            }
            
            if (isLoop)
                break;
        }
    }
}
