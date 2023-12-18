import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static int n,count;
    public static int[] a;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        sumDigits();
        for(int i=0;i<n;i++){
            if(i==n-1)System.out.printf("%d",a[i]);
            else System.out.printf("%d ",a[i]);
        }
        System.out.printf("\n%d\n",count);
        sc.close();
    }
    public static void sumDigits() {
        int flag=1;
        while(flag>0){
            flag=0;
            for(int j=n-1;j>=1;j--){
                if(a[j]<a[j-1]){
                    int b;
                    b=a[j];
                    a[j]=a[j-1];
                    a[j-1]=b;
                    flag=1;
                    count++;
                }
            }
        }
    }
}
