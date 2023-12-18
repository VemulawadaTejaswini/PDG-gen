import java.util.*;
 
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();

        List<Long> list = new ArrayList<Long>();
        for (int i = 0; i < n; i++) {
            long a = scan.nextLong();
            list.add(a);
        }

        Collections.sort(list);//System.out.println(list);
        // listの先頭が0だったら、0を出力して即終了
        if (list.get(0) == 0) {
            System.out.println(0);
            return;
        }

        long ans = 1l;
        boolean isOver = false;
        try {
            for (int i = 0; i < n; i++) {
            long a = list.get(i);
            ans = Math.multiplyExact(ans, a);
            if (ans > 1000000000000000000l) {
                isOver = true;
                break;
            }
            } 
        } catch (ArithmeticException e) {
            isOver = true;
        }
        
        if (isOver) {
            System.out.println(-1);
        } else {
            System.out.println(ans);
        }
        
        /*
        long ans = 1l;
        for (int i = 0; i < n; i++) {
            long a = list.get(i);
            ans *= a;
            if (ans > 1000000000000000000l || ans < 0) {
                break;
            }
        }
        if (ans > 1000000000000000000l || ans < 0) {
            //System.out.println(ans);
            System.out.println(-1);
        } else {
            System.out.println(ans);
        }
        */
        
    }
}