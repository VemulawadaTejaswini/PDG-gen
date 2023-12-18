import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        long ans = 1;
        for (int i=0;i<n;i++)a[i]=sc.nextInt();
        Arrays.sort(a);
        int l = (k/2)*2;
        int front = 0;
        int back = n-1;
        if (a[n-1]<0&&k%2==0){
            for (int i=0;i<k;i++) {
                ans=(ans*a[i])%(long)(Math.pow(10, 9) + 7);
            }
        }else if (a[n-1]<0&&k%2==1){
            for (int i=n-1;i>=n-k;i--) {
                ans=(ans*a[i])%(long)(Math.pow(10, 9) + 7);
            }
        }else if (a[0]>0){
            for (int i=n-1;i>=n-k;i--) {
                ans=(ans*a[i])%(long)(Math.pow(10, 9) + 7);
            }
        }else {
            for (int i=0;i<l;i+=2) {
                long left=a[front]*a[front+1];
                long right=a[back]*a[back-1];
                if (left<right&&a[back-2]>=0){
                    ans=(ans*right)%(long)(Math.pow(10, 9) + 7);
                    back-=2;
                }else {
                    ans=(ans*left)%(long)(Math.pow(10, 9) + 7);
                    front+=2;
                }
            }
            ans%=(long) (Math.pow(10, 9) + 7);
            if (k%2==1){
                ans=(ans*a[back])%(long)(Math.pow(10, 9) + 7);
            }
        }
        ans=(ans+(long)(Math.pow(10, 9) + 7))%(long)(Math.pow(10, 9) + 7);
        System.out.println(ans);

    }
}
