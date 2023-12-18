import java.util.*;

public class Main {
    public static void main(String[] args ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        // お菓子を持っているすぬけ君のみ格納する
        Set<Integer> candy = new HashSet<Integer>();
        while(sc.hasNext()){
            int d = sc.nextInt(); // お菓子1をもっている人数
            // System.out.println(d);
            for(int i = 0;i < d;i++) {
                candy.add(sc.nextInt());
                // System.out.println(candy);
            }
        }
        System.out.println(N - candy.size());
    }
}
