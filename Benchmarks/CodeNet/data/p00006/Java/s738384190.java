import java.util.*;
import java.util.stream.Collectors;
import static java.lang.System.*;

public class Main extends CodingSupport {
    protected void solve() {
        String inputStr = sc.nextLine();
        StringBuffer sb = new StringBuffer(inputStr);
        print(sb.reverse());
    }
}

abstract class CodingSupport {
    protected Scanner sc;
    protected CodingSupport() {
        sc = new Scanner(in);
    }
    
    public static void main(String[] args) throws Exception {
        new Main().solve();
    }
    
    protected abstract void solve();
    
    protected void print(Object o) {
        out.println(o);
    }
    
    protected Long[] scanLongs() {
        return 
          Arrays
              .stream(scanInts())
              .map(Integer::longValue)
              .toArray(Long[]::new);
    }
    
    protected Double[] scanDoubles() {
        return 
          Arrays
              .stream(scanInts())
              .map(Integer::doubleValue)
              .toArray(Double[]::new);
    }
    
    protected Integer[] scanInts() {
       return strArrayToIntArray(sc.nextLine().split(" "));
    }
    
    protected String[] scanLineToTokens(String delimiter) {
        return sc.nextLine().split(delimiter);
    }
    
    protected int scanInt() {
       return sc.nextInt();
    }

    protected List<Integer> strArrayToIntList(String[] strArray) {
        List<Integer> intList =
          Arrays
            .stream(strArray)
            .map(Integer::valueOf)
            .collect(Collectors.toList());
        return intList;
    }
    
    protected Integer[] strArrayToIntArray(String[] strArray) {
        Integer[] intArray =
        Arrays
            .stream(strArray)
            .map(Integer::valueOf)
            .toArray(Integer[]::new);
        return intArray;
    }
}
