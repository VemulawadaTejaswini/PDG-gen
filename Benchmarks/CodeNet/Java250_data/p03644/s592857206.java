import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] values = new int[N+1];
        for (int i=1; i<=N; i++) {
            values[i] = i;
        }
        int count = 1;
        hoge: while (true) {
            int cnt = 0;
            for (int i=1; i<=N; i++) {
                if (values[i] % 2 == 0) {
	                values[i] = values[i] / 2;
                    count = i;
                } else {
                  cnt++ ;
                }  
            }
            
           
            if (cnt == N) {
              break hoge;
            }
        }
        System.out.println(count);
    }
}