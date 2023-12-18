import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();

        int[] t = new int[n];
        for(int i= 0; i < n; i++) {
            t[i] = sc.nextInt();
        }

        Arrays.sort(t);

        int countBus = 1;
        int minPerson = 0;
        for(int i = 1; i < n; i++) {
            // capacity is full
            if(i - minPerson + 1 <= c && t[i] - t[minPerson] <= k) {
                // ok
            } else {
                countBus++;
                minPerson = i;
            }
        }

        System.out.println(countBus);
    }
}
