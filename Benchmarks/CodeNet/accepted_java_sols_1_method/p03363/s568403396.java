import java.util.*;
import java.util.stream.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        long a[]=new long[scanner.nextInt()+1];
        System.out.println(IntStream.range(0,a.length).mapToLong(i->a[i]=(i==0?0:a[i-1]+scanner.nextInt())).boxed().collect(Collectors.groupingBy(i->i,Collectors.counting())).values().stream().mapToLong(i->i*(i-1)/2).sum());
    }
}