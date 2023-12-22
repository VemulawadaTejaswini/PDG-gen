import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static int n;
    public static int[] a;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        for(int i=n-1;i>=0;i--){
            if(i==0) System.out.printf("%d",a[i]);
            else System.out.printf("%d ",a[i]);
        }
        System.out.printf("\n");
        return;
}
}
