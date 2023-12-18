import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int max=0;
        int min=Integer.MAX_VALUE;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
            max=Math.max(arr[i],max);
            min=Math.min(min,arr[i]);
        }
        int total=0;
        int ans=Integer.MAX_VALUE;
        for(int i=min;i<=max;i++){
            total=0;
            for(int j=0;j<n;j++){
                total=total+(int)Math.pow(arr[j]-i,2);
            }
          ans=Math.min(total,ans);
        }
        System.out.println(ans);

    }
}
