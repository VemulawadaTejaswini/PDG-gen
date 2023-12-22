
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        Integer n = Integer.valueOf(scan.next());
        Integer k = Integer.valueOf(scan.next());
        Integer q = Integer.valueOf(scan.next());

        LinkedHashMap<Integer, Integer> score = new LinkedHashMap<>();
        for (int i = 1; i <= n; i++) {
            score.put(i, k);
        }

        int i = 0;
        for (; i < q; i++) {
            Integer winner = Integer.valueOf(scan.next());
            score.put(winner,score.get(winner)+1);
            //System.out.println(score);
        }

        for(int now : score.values()){
            System.out.println(now<=i?"No":"Yes");
        }

    }

}
