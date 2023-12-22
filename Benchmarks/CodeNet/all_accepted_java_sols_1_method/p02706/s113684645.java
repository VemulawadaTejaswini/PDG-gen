import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int sum = 0;
        int tmp = 0;
        for(int i = 0; i < M; i++) {
            tmp = sc.nextInt();
            sum += tmp;
        }

        if(sum > N)
            System.out.println("-1");
        else
            System.out.println(N - sum);
    }
}
