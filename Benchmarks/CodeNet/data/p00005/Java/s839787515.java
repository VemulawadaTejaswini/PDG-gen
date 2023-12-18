import java.util.*;
import java.util.stream.Collectors;
import static java.lang.System.*;

public class Main extends CodingSupport {
    protected void solve() {
        while(sc.hasNext()) {
            Long[] inputs = scanLongs();
            Long greatestCommonDivisor = 1l;
            greatestCommonDivisor = euclidsDeductionMethod(inputs[0], inputs[1]);
            Long leastCommonMultiple = (inputs[0] * inputs[1]) / greatestCommonDivisor;
            print(greatestCommonDivisor + " " + leastCommonMultiple);
        }
        
    }
    
    private long euclidsDeductionMethod(long op1, long op2) {
        long n =0, m = 0;
        if( op1 > op2 ) {
            m = op1;
            n = op2;
        } else {
            m = op2;
            n = op1;
        }
        long greatestCommonDivisor = 1l;
        while(true) {
            if(n == 0) {
                greatestCommonDivisor = m;
                break;
            }
            long nNew = m % n;
            long mNew = n;
            n = nNew;
            m = mNew;
        }
        return greatestCommonDivisor;
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
