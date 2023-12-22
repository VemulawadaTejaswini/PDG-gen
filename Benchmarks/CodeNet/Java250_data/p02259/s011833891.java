import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int ans = 0;
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        boolean flag = true;
        while(flag){
            flag = false;
            for(int j = n-1; j > 0; j--){
                if(a[j] < a[j-1]){
                    int work = a[j];
                    a[j] = a[j-1];
                    a[j-1] = work;
                    ans ++;
                    flag =true;
                }
            }
        }
        for(int i = 0; i < n-1; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println(a[n-1]);
        System.out.println(ans);
    }
}

