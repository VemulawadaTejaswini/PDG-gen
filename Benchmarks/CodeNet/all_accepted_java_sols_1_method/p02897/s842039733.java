import java.util.*;

public class Main {
    public static void main(String[] args){
        int N;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int cont = 0;
        for (int i=1; i<=N; i+=2){
            cont++;
        }
        System.out.printf("%.9f\n", cont*1.0/N);
    }
}
