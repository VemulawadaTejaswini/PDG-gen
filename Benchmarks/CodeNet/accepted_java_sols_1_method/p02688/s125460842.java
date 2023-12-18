import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int K = sc.nextInt();
        sc.nextLine();
        int[] sunuke = new int[N];
        int kagaisha = 0;

        for (int i = 0; i < K; i++) {
            int okashi_num = Integer.parseInt(sc.nextLine());
            
            for(int j = 0; j < okashi_num; j++) {
                int sunuke_num = sc.nextInt();
                sunuke[sunuke_num-1]++;
            }
            sc.nextLine();
        }

        for (int i = 0; i < N; i++) {
            if (sunuke[i] == 0) {
                kagaisha++;
            }
        }
        
        System.out.println(kagaisha);
    }
}