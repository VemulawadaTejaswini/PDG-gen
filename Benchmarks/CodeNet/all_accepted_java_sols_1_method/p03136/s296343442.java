import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] l = new int[N];
        int max = 0;
        int sum = 0;
 
        for (int i =0; i<N; i++) {
            l[i] = sc.nextInt();
            sum += l[i];
            if (max < l[i]) {
                max = l[i];
            }
        }

        String result = sum-max > max ? "Yes" : "No";
        System.out.println(result);
    }
}