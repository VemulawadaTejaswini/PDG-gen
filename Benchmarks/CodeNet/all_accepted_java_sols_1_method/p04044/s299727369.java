import java.util.*;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int L = sc.nextInt();
        String[] a = new String[N];
        for(int i = 0 ; i < N ; i++){
            a[i] = sc.next();
        }

        Arrays.sort(a);
        for(int j = 0 ; j < N ; j++){
            System.out.print(a[j]);
        }
    }
}