import java.util.Scanner;
public class Main{
    public static int count(long a[], int b, int e, long k){
        int count = 0;
        for(int i = b ; i < e ; i++){
            if(a[i] == k)
                count++;
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a[] = new long[n];
        for(int i = 0 ; i < n ; i++)
            a[i] = sc.nextLong();
        int q = sc.nextInt();
        for(int i = 0 ; i < q ; i++){
            int b = sc.nextInt();
            int e = sc.nextInt();
            long k = sc.nextLong();
            System.out.println(count(a,b,e,k));
        }
    }
}
