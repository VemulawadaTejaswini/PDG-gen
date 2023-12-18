import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Integer> x = new ArrayList<>();
        ArrayList<Integer> l = new ArrayList<>();

        int ans = 0;

        for (int i = 0; i < m; i++) {
            x.add(sc.nextInt());
        }
        Collections.sort(x);

        for (int i = 1; i < m; i++) {
            l.add(Math.abs(x.get(i-1) - x.get(i)));
        }
        Collections.sort(l);

        for (int i = 0; i < m - n; i++) {
            ans += l.get(i);
        }
        System.out.println(ans);

//        for (int i = 0; i < m; i++) {
//            System.out.println(l.get(i));
//        }



    }
}
