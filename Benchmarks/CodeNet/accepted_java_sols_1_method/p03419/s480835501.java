import java.util.PriorityQueue;
import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int mi = Math.min(N,M);
        int ma = Math.max(N,M);
        if (mi == 1 && ma == 1) {
            System.out.println(1);
        } else if(mi == 1) {
            System.out.println(ma-2);
        }else{
            System.out.println((long)(N - 2) * (M - 2));
        }
    }
}