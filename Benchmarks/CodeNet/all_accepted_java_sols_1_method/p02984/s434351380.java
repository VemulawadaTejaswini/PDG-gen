import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = Integer.parseInt(sc.next());
        }
        sc.close();
        int sign = 1;
        long a1 = 0;
        for(int i=0;i<n;i++){
            a1+=a[i]*sign;
            sign*=-1;
        }
        System.out.println(a1);
        a1/=2;
        for(int i=0;i<n-1;i++){
            System.out.println((a[i]-a1)*2);
            a1 = a[i]-a1;
        }
    }
}