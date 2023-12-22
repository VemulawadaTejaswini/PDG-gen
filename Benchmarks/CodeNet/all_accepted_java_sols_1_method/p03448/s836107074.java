import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];

        for(int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
        }
        int X = sc.nextInt();
        int res = 0;

        for(int i = 0; i <= arr[0]; i++) {
            for(int j = 0; j <= arr[1]; j++) {
                for(int k = 0; k <= arr[2]; k++) {
                    int total = 500*i + 100*j + 50*k;
                    if(total == X) {
                        res++;
                    }
                }
            }
        }
        System.out.println(res);
    }
}
