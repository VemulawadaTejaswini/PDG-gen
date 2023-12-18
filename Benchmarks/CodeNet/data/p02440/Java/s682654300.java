import java.util.Scanner;
public class Main{
    public static long m(long a[], int b, int e){
        int Min = a[b];
        for(int i = b+1 ; i < e ; i++)
            Min = Math.min(Min,a[i]);
        return Min;
    }
    public static long M(long a[], int b, int e){
        int Max = a[b];
        for(int i = b+1 ; i < e ; i++)
            Max = Math.max(Max,a[i]);
        return Max;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a[] = new long[n];
        for(int i = 0 ; i < n ; i++)
            a[i] = sc.nextLong();
        int q = sc.nextInt();
        for(int i = 0 ; i < q ; i++){
            int com = sc.nextInt();
            int b = sc.nextInt();
            int e = sc.nextInt();
            if(com == 0)
                System.out.println(m(a,b,e));
            else
                System.out.println(M(a,b,e));
        }
    }
}
