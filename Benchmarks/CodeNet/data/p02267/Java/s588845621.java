import java.util.*;

//Linear Search
public class Main {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[10000 + 1];
        for(int i = 0; i<n; i++){
            A[i] = sc.nextInt();
        }

        int q = sc.nextInt();
        int[] Key = new int[10000 + 1];
        for(int i = 0; i<q; i++){
            Key[i] = sc.nextInt();
            if(search(A, n, q, Key[i]) == 1){
                count++;
            }
        }
        System.out.println(count);

    }

    public static int search(int[] A, int n, int q, int Key) {
        int i, j;
        int sum = 0;
        for(i = 0; i<n; i++){
                if(Key != A[i]){
                    sum++;
                }
        }
        if(sum == n){
            return 0;
        }
        return 1;
    }
}
