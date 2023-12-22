import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int ans=0;
        int flag=1;
        while(flag==1){
            flag=0;
            for(int j=n-1;j>0;j--){
                if(a[j]<a[j-1]){
                    ans++;
                    flag=1;
                    int tmp=a[j];
                    a[j]=a[j-1];
                    a[j-1]=tmp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]);
            if(i!=n-1) System.out.printf(" ");
        }
        System.out.printf("\n");
        System.out.println(ans);
    }
}
