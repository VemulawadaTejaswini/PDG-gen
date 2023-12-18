import java.util.*;
 
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            int a = scan.nextInt();
            list.add(a);
        }

        //System.out.println(list);

        int q = scan.nextInt();

        for (int i = 0; i < q; i++) {
            int b = scan.nextInt();
            int c = scan.nextInt();
            int ans = 0;
            for (int j = 0; j < n; j++) {
                if (list.get(j) == b) {
                    list.set(j, c);
                }
                ans += list.get(j);
            }
            System.out.println(ans);
        }
    }
}