import java.util.*;

public class Main {



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();


        List<Integer> l = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int ai = sc.nextInt();
            l.add(ai);
        }

        Collections.sort(l);

        int ans = 0;
        long sum = 0;

        for(int i = 0; i < n; i++) {
            sum += l.get(i);
            if(sum <= x)
                ans = i + 1;
        }

        if(ans == n && sum != x)
            ans--;

        System.out.println(ans);

    }
}
