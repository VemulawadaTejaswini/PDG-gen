import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++) {
            b[i] = sc.nextInt();
        }
        sc.close();

        ArrayList<Integer> list = new ArrayList<>();
        int sumA = 0;
        int sumB = 0;
        for(int i=0; i<n; i++) {
            sumA += a[i];
            for(int j=i; j<n; j++) {
                sumB += b[j];
            }
            list.add(sumA+sumB);
            sumB = 0;
        }

        java.util.Collections.sort(list);
        System.out.println(list.get(list.size()-1));
    }
}
