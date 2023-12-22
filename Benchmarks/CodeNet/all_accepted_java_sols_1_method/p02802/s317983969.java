import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        boolean[] isAc = new boolean[n];
        int[] waCounter = new int[n];
        for (int i = 0; i < m; i++) {
            int nOrder = sc.nextInt() - 1;
            String result = sc.next();
            if (!isAc[nOrder]){
                if (result.equals("AC")) isAc[nOrder]=true;
                else waCounter[nOrder]++;
            }
        }

        int ac = 0;
        int wa = 0;
        for (int i = 0; i < n; i++) {
            if (isAc[i]){
                ac++;
                wa+=waCounter[i];
            }
        }
        System.out.println(ac + " " + wa);
    }
}