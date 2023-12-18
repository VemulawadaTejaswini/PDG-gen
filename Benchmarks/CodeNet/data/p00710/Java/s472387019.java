import java.util.Scanner;

public class Main{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        while(true){
            int n=sc.nextInt();
            int r=sc.nextInt();
            if(n==0 && r==0)break;
            int[] ans=new int[n];
            for(int i=0;i<n;i++)ans[i]=n-i;
            for(int i=0;i<r;i++){
                int p=sc.nextInt();
                int c=sc.nextInt();
                int[] swap=new int[p-1];
                for(int j=0;j<p-1;j++)swap[j]=ans[j];
                for(int j=0;j<c;j++)ans[j]=ans[p-1+j];
                for(int j=0;j<p-1;j++)ans[c+j]=swap[j];
            }
            System.out.println(ans[0]);
        }
        sc.close();
    }
}
