import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;++i) {
            a[i]=sc.nextInt();
        }
        long last=Integer.MIN_VALUE;
//        long grd=1;
        for(int i=0;i<n;++i) {
//            grd*=a[i];
            if(i>=k) {

//                grd /= a[i - k];
//                System.out.println(grd);
                if(a[i]>a[i-k])
                    System.out.println("Yes");
                else
                    System.out.println("No");

            }
//            last=grd;
        }
    }
}