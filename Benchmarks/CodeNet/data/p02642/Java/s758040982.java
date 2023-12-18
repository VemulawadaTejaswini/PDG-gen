import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] As = new int[N];
        for (int i = 0; i < N; i++) {
            As[i] = sc.nextInt();
        }
        int counter = 0;
        for (int i = 0; i < As.length; i++) {
            boolean divided = false;
            for (int j = 0; j < As.length; j++) {
                if (i != j && As[i] % As[j] == 0) {
                    divided = true;
                    break;
                }
            }
            if (!divided) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}