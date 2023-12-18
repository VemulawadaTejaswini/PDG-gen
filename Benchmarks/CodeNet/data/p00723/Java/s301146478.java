import java.util.*;

public class Main {
    public static void main(String args[]) {
        solve1142();
    }

    public static void solve1142() {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            String dataset = sc.next();
            HashSet<String> set = new HashSet<String>();

            for (int index = 0; index < dataset.length(); index++) {
                String zenhan = dataset.substring(0, index);
                String kouhan = dataset.substring(index);

                StringBuffer sb_zenhan = new StringBuffer(zenhan);
                StringBuffer sb_kouhan = new StringBuffer(kouhan);

                String rev_zenhan = sb_zenhan.reverse().toString();
                String rev_kouhan = sb_kouhan.reverse().toString();


                set.add(zenhan + kouhan);
                set.add(zenhan + rev_kouhan);
                set.add(rev_zenhan + kouhan);
                set.add(rev_zenhan + rev_kouhan);
                set.add(kouhan + zenhan);
                set.add(kouhan + rev_zenhan);
                set.add(rev_kouhan + zenhan);
                set.add(rev_kouhan + rev_zenhan);

            }
            System.out.println(set.size());
        }
    }

}

