import java.util.*;
 
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int waNum = 0;
        int acNum = 0;
        int[] wa = new int[N];
        boolean[] ac = new boolean[N];
        for (int i = 0; i < M; i++) {
            int p = sc.nextInt()-1;
            String S = sc.next();
            if (S.equals("AC") && !ac[p]) {
                waNum += wa[p];
                acNum++;
                ac[p] = true;
            } else if (S.equals("WA") && !ac[p]) {
                wa[p]++;
            }
        }

        System.out.println(acNum + " " + waNum);
    }
}
