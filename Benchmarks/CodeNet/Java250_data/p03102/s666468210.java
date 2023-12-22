import java.util.*;
import java.util.stream.*;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        List<Integer> NMC = numbers();
        List<Integer> B = numbers();

        int count = 0;
        for(int n=0; n<NMC.get(0); n++) {
            List<Integer> A = numbers();
            int sum = 0;
            for(int m=0; m<NMC.get(1); m++) {
                sum += A.get(m) * B.get(m);
            }
            sum += NMC.get(2);
            if(sum > 0) {
                count++;
            }
        }

        print(count);
    }

    public static List<Integer> numbers() {
        List<Integer> integers = new ArrayList<>();
        for(String item: getLine().split(" ")) {
            integers.add(toInt(item));
        }
        return integers;
    }

    public static void add(int[][] a, int[] n, int[] m) {
        for(int i = 0; i < n.length; i++) {

        }
    }

    public static int sum(int[][] a, int[] n, int[] m) {
        int sum = 0;
        for(int i=0; i<n.length; i++) {
            for(int j=0; j<m.length; j++) {
                if(n[i] == 1 && m[j] == 1) {
                    sum += a[i][j];
                }
            }
        }

        return sum;
    }

    public static int getInt() {
        return scan.nextInt();
    }

    public static String getLine() {
        return scan.nextLine();
    }

    public static int toInt(String str) {
        return Integer.parseInt(str);
    }

    public static long toLong(String str) {
        return Long.parseLong(str);
    }

    public static void print(String str) {
        System.out.println(str);
    }

    public static void print(int num) {
        print("" + num);
    }
}
