import java.util.*;

public class Main{
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int K = scan.nextInt();
    int []p = new int[N];
    for(int i=0;i<N;i++) {
        p[i] = scan.nextInt();
    }
    scan.close();

    Arrays.sort(p);

    int sum = 0;
    for(int i=0;i<K;i++) {
        sum += p[i];
    }

    System.out.println(sum);
}
}
