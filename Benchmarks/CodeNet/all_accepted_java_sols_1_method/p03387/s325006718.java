import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] A = {a, b, c};
        Arrays.sort(A);
        
        int n = (A[2] - A[1]) / 2;
        int m = (A[2] - A[0]) / 2;
        A[1] += 2 * n;
        A[0] += 2 * m;
        int count = n + m;
        if (A[2] > A[1] && A[2] > A[0]) {
            count++;
        } else if (A[2] > A[1] || A[2] > A[0]) {
            count += 2;
        }
        
        System.out.println(count);
    }
}
