import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Greatest Common Divisor
 * 
 *
 */
public class Main {
    
    public static void main(String[] args) {
        // input data
        List<String> input = inputLines();
        
        // get input
        int x = Integer.valueOf(input.get(0).split(" ")[0]);
        int y = Integer.valueOf(input.get(0).split(" ")[1]);
        if (y > x) {
            int tmp = x;
            x = y;
            y = tmp;
        }
        int gcd = 0;

        // main logic
        
        gcd = gcd(x,y);

        output(gcd);
    }

    private static int gcd(int n,int m) {
        if (m == 0) {
            return n;
        }
        return gcd(m, n % m);
    }

    private static List<String> mocups() {
        List<String> input = Arrays.asList(
                "6 15"
                );
        return input;
    }

    /** output data */
    private static void output(Object o) {
        System.out.println(o);
    }
    private static void output(String[] o) {
        System.out.println(Arrays.toString(o));
    }
    private static void output(int[] o) {
        System.out.println(Arrays.toString(o));
    }
    private static void output(Object[] o) {
        System.out.println(Arrays.toString(o));
    }

    /** input data */
    private static List<String> inputLines() {
        Scanner in = new Scanner(System.in);
        List<String> input = new ArrayList<String>();
        while(in.hasNext()) {
            String buf = in.nextLine();
            input.add(buf);
        }
        in.close();
        return input;
    }

}