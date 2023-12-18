import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] numbers = new int[n];

        for (int i = 0; i <n ; i++) {
            numbers[i] = sc.nextInt();
        }

        Arrays.sort(numbers);

        int count = 0;
        for (int i = 0; i < n-2; i++) {
            for (int j = i+1; j < n-1; j++) {
                for (int k = j+1; k < n; k++) {

                    int a = numbers[i];
                    int b = numbers[j];
                    int c = numbers[k];

                    if (a != b && b!=c && a!=c) {
                        if (a+b > c) {
                            count++;
                        }
                    }


                }
            }
        }

        System.out.println(count);

    }
}