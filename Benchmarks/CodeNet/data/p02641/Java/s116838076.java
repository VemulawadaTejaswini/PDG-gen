import java.util.*;
 
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int n = scan.nextInt();

        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            int a = scan.nextInt();
            list.add(a);
        }

        Collections.sort(list);//System.out.println(list);
        
        int ans = 110;
        int def = 110;

        for (int i = 0; i <= 100; i++) {
            boolean flag = false;
            for (int val : list) {
                if (i == val) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                continue;
            }
            int a = Math.abs(i - x);
            if ( def > a) {
                def = a;
                ans = i;
            }
        }

        System.out.println(ans);
    }
}