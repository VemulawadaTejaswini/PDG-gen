import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int array[] = new int[10001];

        for (int i = 1; i < 101; i++) {
            for (int j = 1; j < 101; j++) {
                for (int k = 1; k < 101; k++) {
                    int sum = i * i + j * j + k * k + i * j + j * k + k * i;
                    if (sum < 10001) {
                        array[sum]++;
                    }
                }
            }
        }

        for (int i = 1; i < n + 1; i++) {
            System.out.println(array[i]);
        }

        sc.close();

    }

}