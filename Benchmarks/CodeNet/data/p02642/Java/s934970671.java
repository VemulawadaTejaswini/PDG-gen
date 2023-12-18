import java.util.*;

class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=input.nextInt();
        }
        int count=0;
        int ans=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i!=j&&a[i]%a[j]!=0){
                    count++;
                }
            }
            if(count==n-1){
                ans++;
            }
            count=0;
        }
        System.out.print(ans);
    }
}