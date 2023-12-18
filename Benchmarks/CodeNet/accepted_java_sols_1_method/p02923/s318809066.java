
import java.util.Scanner;

 class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        long[] h=new long[n];
        for(int i=0;i<n;i++)
            h[i]=in.nextLong();
        int[] a = new int[n];
        for(int i=1;i<n;i++){
            if(h[i-1]-h[i] >=0)
                a[i]=0;
            else
                a[i]=-1;
        }
        int ans=0;
        for(int i=1;i<n;){
            boolean inside=false;
            if(a[i]==0){
                inside=true;
                int count=0;
                while(i<n && a[i]==0){
                    count++;
                    i++;
                }
                ans=Math.max(ans, count);
            }
            if(!inside)
                i++;

        }
        System.out.println(ans);

    }
}
