import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int N = sc.nextInt();
        int a[] = new int[N];
        for(int i = 0; i < N; i ++){
            a[i] = sc.nextInt();
            if(i % 2 != 0 && a[i] % 2 != 0){
                n = n + 1;
            }
        }

        System.out.println(n);

    }
}