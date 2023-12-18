import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        ArrayList<BigDecimal> list = new ArrayList<BigDecimal>();

        for(int i=0; i<num; i++){
            list.add(sc.nextBigDecimal());
        }

        BigDecimal sumnum = new BigDecimal(0);

        for (BigDecimal e : list) {
            sumnum = sumnum.add(e);
        }

        Optional<BigDecimal> maxnum = list.stream().max(Comparator.naturalOrder());
        Optional<BigDecimal> minnum = list.stream().min(Comparator.naturalOrder());

        minnum.ifPresent(n -> System.out.print(n + " "));
        maxnum.ifPresent(n -> System.out.print(n + " "));
        System.out.println(sumnum);
    }
}

