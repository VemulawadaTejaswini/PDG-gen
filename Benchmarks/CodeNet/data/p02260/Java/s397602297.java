import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] input = new int[n];

        for (int i = 0; i < n; i++) {
            input[i] = sc.nextInt();
        }

        int count = 0;
        int min;
        for(int i = 0; i < n; i++) {
            min = i;
            for(int j = i; j < n; j++) {
                if(input[j] < input[min]) {
                    min = j;
                }
            }
            int temp = input[i];
            input[i] = input[min];
            input[min] = temp;
            if(i != min) {
                count++;
            }
        }

        System.out.print(input[0]);
        for(int i = 1; i < n; i++) {
            System.out.print(" " + input[i]);
        }

        System.out.println();
        System.out.println(count);
    }
}