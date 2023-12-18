import java.util.*;

public class Main {
    public static void main(String[] args) {
        try(Scanner scn = new Scanner(System.in)) {
            int n = 0;
            while((n = scn.nextInt()) > 0) {
                int[] ary = new int[n];
                for(int i = 0; i < n; i++) {
                    ary[i] += scn.nextInt();
                    ary[i] += scn.nextInt();
                    ary[i] += scn.nextInt();
                    ary[i] += scn.nextInt();
                    ary[i] += scn.nextInt();
                }
                Arrays.sort(ary);
                System.out.println(ary[~-n] + " " + ary[0]);
            }
        }
    }
}