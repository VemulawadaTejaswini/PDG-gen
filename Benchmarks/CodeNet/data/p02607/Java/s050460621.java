import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int ans = 0;
        // 配列
        int[] a = new int[n+1];
        for(int i=1;i<=n;i++){
            a[i] = sc.nextInt();
            if(i%2==1 && a[i]%2==1) {
                ans++;
            }
        }




        System.out.println(ans);
    }
}
