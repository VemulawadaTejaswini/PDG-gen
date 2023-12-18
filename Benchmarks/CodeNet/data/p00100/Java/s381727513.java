import java.util.*;
import java.util.stream.Collectors;

public class Main {
    private static long SALES_AMOUNT = 1000000;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final List<Integer> resultSales = new ArrayList<>();
        while(true) {
            int dataNum = Integer.parseInt(scanner.nextLine());
            if(dataNum == 0) break;
            List<SalesData> salesDataList = new ArrayList<>();
            for(int i = 0; i < dataNum; i++) {
                String[] data = scanner.nextLine().split(" ");
                salesDataList.add(new SalesData(Integer.parseInt(data[0])
                        ,Integer.parseInt(data[1])
                        ,Integer.parseInt(data[2])));
            }

            List<Integer> targetSales = new ArrayList<>();
            salesDataList.stream()
                    .collect(Collectors.groupingBy(elem->elem.no))
                    .forEach((k,v)-> {
                        Long amount = v.stream().mapToLong(it->it.num*it.price).sum();
                        if(amount >= SALES_AMOUNT) {
                            targetSales.add(k);
                        }
                    });

            if(targetSales.size() > 0) {
                resultSales.addAll(targetSales);
            }else{
                resultSales.add(null);
            }
        }

        resultSales.forEach(it -> {
            if(it == null) {
                System.out.println("NA");
            } else {
                System.out.println(it);
            }

        });
    }

    private static class SalesData {
        public int no;
        public long price;
        public long num;

        public SalesData(int no, long price, long num) {
            this.no = no;
            this.price = price;
            this.num = num;
        }
    }
}