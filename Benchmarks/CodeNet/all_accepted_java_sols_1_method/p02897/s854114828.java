import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        TreeMap<Long,Integer> map = new TreeMap<Long,Integer>(Comparator.reverseOrder());
        int n = sc.nextInt();
        System.out.println(n % 2 == 0 ? (double)(n/2)/n : (double)(n/2+1)/n);
    }
}