import java.util.*;

public class Main {
    public static void main(String[] args) {
        try(Scanner scn = new Scanner(System.in)) {
            int num;
            while((num = scn.nextInt()) > 0) {
                int min = scn.nextInt();
                int max = scn.nextInt();

                int[] ary = new int[-~num];
                for(int i = 0; i < num; i++) {
                    int tmp = scn.nextInt();
                    ary[i]   -= tmp;
                    ary[-~i] += tmp;
                }

                int gap = 0;
                int ans = 0;
                for(int i = min; i <= max; i++) {
                    if(gap <= ary[i]) {
                        gap = ary[i];
                        ans = i;
                    }
                }

                System.out.println(ans);
            }
        }
    }
}