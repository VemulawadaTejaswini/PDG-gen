import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int tall[] = new int[N];
        int count = 0;
        for(int i = 0; i < N; ++i){
            tall[i] = sc.nextInt();
        }
        for(int i = 0; i < N; ++i){
            if(tall[i] >= K){
                count += 1;
            }
        }
        System.out.println(count);
    }
}