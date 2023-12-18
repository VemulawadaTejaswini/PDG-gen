import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
// ?¨??????\???????????????????????????????????????
        while (true) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            if(n==0) break;
            ArrayList<Integer> scores = new ArrayList<Integer>();

            for (int i = 0; i < n; i++) {
                scores.add(sc.nextInt());
            }
            int max = scores.get(0);
            int maxnum = 0;
            int min = scores.get(0);
            int minnum = 0;
            for (int i = 0; i < n; i++) {
                if (max < scores.get(i)) {
                    max = scores.get(i);
                    maxnum = i;
                }
                if (scores.get(i) < min) {
                    min = scores.get(i);
                    minnum = i;
                }
            }
            int av = 0;
            int cnt = 0;
            for (int i = 0; i < scores.size(); i++) {
                if (scores.get(i) == min || scores.get(i) == max && cnt < 2) {
                    cnt++;
                    continue;
                }
                av += scores.get(i);
            }
            av /= scores.size() - 2;
            System.out.println(av);
        }
    }

}