import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        boolean[] a = new boolean[n];

        for(int i = 0; i < k; i++){
            int d = sc.nextInt();
            for(int j = 0; j < d; j++){
                a[sc.nextInt() - 1] = true;
            }
        }

        int sum = 0;
        for(int i = 0; i < n; i++){
            if(!a[i]){
                sum++;
            }
        }
        System.out.println(sum);
    }
}
