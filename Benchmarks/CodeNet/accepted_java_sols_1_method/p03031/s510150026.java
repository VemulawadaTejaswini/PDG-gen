import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<ArrayList<Integer>> s = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            int k = sc.nextInt();
            for (int j = 0; j < k; j++) {
                list.add(sc.nextInt()-1);
            }
            s.add(list);
        }
        int[] p = new int[m];
        for (int i = 0; i < m; i++) p[i] = sc.nextInt();
        long ans = 0L;
        for (int i = 0; i < (1 << n); i++) {
            int[] c = new int[m];
            boolean able = true;
            for (int j = 0; j < m; j++) {
                for(int d : s.get(j)){
                    if((i >> d & 1) == 1) c[j]++;
                }
                if(c[j] % 2 != p[j]){
                    able = false;
                    break;
                }
            }
            if(able) ans++;
        }
        System.out.println(ans);
        sc.close();

    }

}
