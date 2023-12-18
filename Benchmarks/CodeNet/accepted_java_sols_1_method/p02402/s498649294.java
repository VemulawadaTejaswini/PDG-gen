import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //ArrayList<Integer> A = new ArrayList<Integer>();

        int n = sc.nextInt();
        int[] B = new int[n];
        long sum = 0;
        for (int i=0; i<n; i++) {
            B[i] = sc.nextInt();
        }
        Arrays.sort(B);
        for (int i=0; i<n; i++) {
            sum += B[i];
        }
        System.out.print(B[0]);
        System.out.print(" ");
        System.out.print(B[n-1]);
        System.out.print(" ");
        System.out.println(sum);

    }
}
