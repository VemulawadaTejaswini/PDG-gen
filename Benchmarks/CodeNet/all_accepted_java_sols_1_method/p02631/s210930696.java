import java.util.*;

public class Main{
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int []a = new int[N];
    int sum = 0;
    for(int i=0;i<N;i++) {
        a[i] = scan.nextInt();
        sum ^= a[i];
    }
    scan.close();

    for(int i=0;i<N;i++) {
        System.out.println(String.valueOf(sum ^ a[i]));
    }
    
}
}
