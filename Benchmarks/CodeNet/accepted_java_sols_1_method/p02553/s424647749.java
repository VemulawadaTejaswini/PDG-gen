
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        String[] data = x.split(" ");
        List<BigDecimal> dataDecimalList = new ArrayList();
        for(String a: data){
            BigDecimal bd = new BigDecimal(a);
            dataDecimalList.add(bd);
        }
        List<BigDecimal> targetList = new ArrayList();
        targetList.add(dataDecimalList.get(0).multiply(dataDecimalList.get(2)));
        targetList.add(dataDecimalList.get(0).multiply(dataDecimalList.get(3)));
        targetList.add(dataDecimalList.get(1).multiply(dataDecimalList.get(2)));
        targetList.add(dataDecimalList.get(1).multiply(dataDecimalList.get(3)));

        BigDecimal max = new BigDecimal("-1000000000000000000000000000000000000000000000000000000000000000000000000000");
        for(BigDecimal target: targetList){
            if(max.compareTo(target) == -1){
                max = target;
            }
        }
        System.out.println(max);
    }
}
