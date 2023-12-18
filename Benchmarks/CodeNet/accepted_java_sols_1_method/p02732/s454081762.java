import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> A = new ArrayList<Integer>();
        for (int i=0; i<N; i++) {
            A.add(sc.nextInt());
        }
        Map<Object, Long> countDict = A.stream().collect(
                        Collectors.groupingBy(x -> x, Collectors.counting()));
        long total = 0;
        for (Object key: countDict.keySet()) {
            long count = countDict.get(key);;
            total += count * (count - 1) / 2;
        }
        for (int k=0; k<N; k++) {
            System.out.println(total - countDict.get(A.get(k)) + 1);
        }
    }
}