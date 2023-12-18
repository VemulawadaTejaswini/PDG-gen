import java.util.Scanner;
public class Main{
    public static long min(long a[], int b, int e){
        int min = a[b];
        for(int i = b+1 ; i < e ; i++)
            min = Math.min(min,a[i]);
        return min;
    }
    public static long max(long a[], int b, int e){
        int max = a[b];
        for(int i = b+1 ; i < e ; i++)
            max = Math.max(max,a[i]);
        return max;
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
                System.out.println(min(a,b,e));
            else
                System.out.println(max(a,b,e));
        }
    }
}
