import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] items = new int[N];

        for (int i = 0; i < N; i ++) {
        	items[i] = sc.nextInt();
        }

        sc.close();

        Arrays.sort(items);

        double sum = items[0];
        int item;
        for (int i = 0 ; i < N-1 ; i++ ) {
        	item = items[i+1];
        	sum = (sum + item) / 2 ;
        }

        System.out.println(sum);



    }
}