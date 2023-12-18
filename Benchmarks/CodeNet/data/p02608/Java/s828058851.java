import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[100000];


        for (int i = 1; i*i <= 10000; i++) {
            for (int j = 1; j*j <=10000 ; j++) {
                for (int k = 1; k*k <=10000 ; k++) {
                    int val = i*i+j*j+k*k+i*j+i*k+j*k;
                    arr[val]++;
                }
            }
        }

        for (int i = 1; i <= N; i++) {
            System.out.println(arr[i]);
        }

    }



}
