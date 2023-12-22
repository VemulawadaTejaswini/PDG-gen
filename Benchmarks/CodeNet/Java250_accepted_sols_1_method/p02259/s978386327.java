import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a=new int[101];
        int i,t,j,n,co=0;
        n = sc.nextInt();
        for(i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for(i=n-1;i>0;i--){
            for(j=n-1;j>=n-i;j--){
                if(a[j]<a[j-1]){
                    t=a[j];
                    a[j]=a[j-1];
                    a[j-1]=t;
                    co++;
                }

            }
        }

        for(i=0;i<n;i++){
            if(i==0)System.out.print(a[i]);
            else System.out.print(" "+a[i]);
        }
        System.out.println();
        System.out.println(co);
    }
}
