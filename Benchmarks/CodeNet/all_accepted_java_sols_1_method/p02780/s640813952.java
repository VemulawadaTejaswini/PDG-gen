
import java.util.Scanner;

 class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        int sum=0;
        int i=0, j;
        for(i=0;i<k;i++)
            sum+=a[i];
        int maxSum=sum;
        int left=0, right=k-1;
        for(i=0, j=k;j<n;j++,i++){
            sum=sum-a[i];
            sum=sum+a[j];
            if(sum>maxSum){
                left=i+1;right=j;
                maxSum=sum;
            }
        }
       // System.out.println(left + " " + right);
        double ans=0;
        for(int l=left;l<=right;l++){
           // System.out.println("For: " + a[l]);
            double temp=(double)((a[l]*(a[l]-1))/2);
            //System.out.println(temp);
            temp=(double)(temp+a[l]);
            //System.out.println(temp);
            temp=(double)(temp/a[l]);
            //System.out.println(temp);
            ans+= temp;
        }
        System.out.println(ans);
    }
}
