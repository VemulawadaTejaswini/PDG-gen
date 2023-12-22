import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Integer[] d = new Integer[n];
        for(int i=0; i<n; i++) {
            d[i] = sc.nextInt();
        }

        Set<Integer> setD = new TreeSet<>(Arrays.asList(d));

        System.out.println(setD.size());
        sc.close();
    }
}
