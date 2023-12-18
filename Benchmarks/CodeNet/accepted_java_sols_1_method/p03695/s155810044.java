import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> gray = new ArrayList<Integer>();
        List<Integer> brown = new ArrayList<Integer>();
        List<Integer> green = new ArrayList<Integer>();
        List<Integer> cyan = new ArrayList<Integer>();
        List<Integer> blue = new ArrayList<Integer>();
        List<Integer> yellow = new ArrayList<Integer>();
        List<Integer> orange = new ArrayList<Integer>();
        List<Integer> red = new ArrayList<Integer>();
        List<Integer> gold = new ArrayList<Integer>();
        for (int i = 0 ; i < n ; i++) {
            int a = sc.nextInt();
            if ( a < 400) {
                gray.add(a);
            } else if (a < 800) {
                brown.add(a);
            } else if (a < 1200) {
                green.add(a);
            } else if (a < 1600) {
                cyan.add(a);
            } else if ( a < 2000) {
                blue.add(a);
            } else if (a < 2400) {
                yellow.add(a);
            } else if (a < 2800) {
                orange.add(a);
            } else if (a < 3200) {
                red.add(a);
            } else {
                gold.add(a);
            }
        }
        int color = 0;
        if (!gray.isEmpty()) {
            color++;
        }
        if (!brown.isEmpty()) {
            color++;
        }
        if (!green.isEmpty()) {
            color++;
        }
        if (!cyan.isEmpty()) {
            color++;
        }
        if (!blue.isEmpty()) {
            color++;
        }
        if (!yellow.isEmpty()) {
            color++;
        }
        if (!orange.isEmpty()) {
            color++;
        }
        if (!red.isEmpty()) {
            color++;
        }

        //最大値はcolor + gold.length()
        //最小値はレート3200未満がいるならばcolor いないならば1
        if (color > 0 ) {
            System.out.println(color  + " " + (color + gold.size()));
        } else {
            System.out.println(1+ " " + gold.size() );
        }

    }

}
