import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long[] map = new long[100002];
        int n = sc.nextInt();
        long k = sc.nextLong();
        for(int i = 0; i < n; i++){
            map[sc.nextInt()] += sc.nextLong();
        }
        for(int i = 1; i <= 100000; i++){
            k -= map[i];
            if(k <= 0){
                System.out.println(i);
                return;
            }
        }
    }
}
