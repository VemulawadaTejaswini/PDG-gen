import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    int mod = 998244353;
    int n = sc.nextInt();
    int k = sc.nextInt();
    int[][] lr = new int[k][2];
    List<Integer> list = new ArrayList<>();
//    Set<Integer> set = new HashSet<>();

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        for (int i=0; i<k; i++) {
            lr[i][0] = sc.nextInt();
            lr[i][1] = sc.nextInt();
        }

        for (int i=0; i<k; i++) {
            for (int j=lr[i][0]; j<=lr[i][1]; j++) list.add(j);
        }

//        System.out.println(list);

        System.out.println(countWays(n-1) % mod);



    }

    int countWays(int N)
    {
        int count[] = new int[N + 1];

        // base case
        count[0] = 1;

        // count ways for all values up
        // to 'N' and store the result
        for (int i = 1; i <= N; i++)
            for (int j = 0; j < list.size(); j++)

                if (i >= list.get(j)) {
                    count[i] += count[i - list.get(j)];
                    count[i] %= mod;
                }

        // required number of ways
        return count[N];

    }


}

