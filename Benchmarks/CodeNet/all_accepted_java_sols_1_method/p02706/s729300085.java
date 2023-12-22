import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int s = 0;
        for (int i=0; i<M; i++) {
            s += sc.nextInt();
        }
          
        if (s <= N)
            System.out.println(N - s);
        else
            System.out.println("-1");
    }
}