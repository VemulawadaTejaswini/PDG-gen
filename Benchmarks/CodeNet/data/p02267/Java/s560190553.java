import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int n,q,key,sum = 0;
        Scanner sc = new Scanner(System.in);
        n = Integer.parseInt(sc.next());
        int[] a = new int[10000+1];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(sc.next());
        }
        q = Integer.parseInt(sc.next());
        for (int i = 0; i < q; i++) {
            key = Integer.parseInt(sc.next());
            if(search(a, n , key)) sum++;
        }
        System.out.println(sum);
    }
    
        static boolean search(int a[], int n, int key){
        int i = 0;
        a[n] = key;
        while(a[i] != key) i++;
        return i != n;
    }
}
