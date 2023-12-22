import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());
        
        int[] a = new int[A];
        int[] b = new int[B];
        int minA = Integer.MAX_VALUE;
        int minB = Integer.MAX_VALUE;
        for(int i = 0; i < A; i++){
            a[i] = Integer.parseInt(sc.next());
            if(a[i] < minA) minA = a[i];
        }
        for(int i = 0; i < B; i++){
            b[i] = Integer.parseInt(sc.next());
            if(b[i] < minB) minB = b[i];
        }
        
        int min = minA + minB;
        for(int i = 0; i < M; i++){
            int x = Integer.parseInt(sc.next());
            int y = Integer.parseInt(sc.next());
            int c = Integer.parseInt(sc.next());
            int d = a[x-1] + b[y-1] - c;
            if(d < min) min = d;
        }
        
        System.out.println(min);
    }
}