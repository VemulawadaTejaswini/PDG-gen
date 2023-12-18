import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            List<Integer> a =  IntStream.range(0, sc.nextInt()).mapToObj(x->sc.nextInt()).collect(Collectors.toList());
            int q = sc.nextInt();
            for(int i = 0; i < q; i++) {
                int b = sc.nextInt();
                int e = sc.nextInt();            	
                List<Integer> sub = a.subList(b, e);
                Collections.reverse(sub);
                for(int j = b; j < e; j++) {
                	a.set(j, sub.get(j-b));
                }
            }
            System.out.println(String.join(" ", a.stream().map(String::valueOf).toArray(String[]::new)));
        }
    }
}
