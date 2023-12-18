import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main{
    private static int SALES_AMOUNT = 1000000;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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


            final List<Integer> targetSales = new ArrayList<>();

            salesDataList.stream()
                    .collect(Collectors.groupingBy(elem->elem.no))
                    .forEach((k,v)-> {
                        Integer amount = v.stream().mapToInt(it->it.num*it.price).sum();
                        if(amount >= SALES_AMOUNT) {
                            targetSales.add(k);
                        }
                    });

            if(targetSales.size() > 0) {
                targetSales.forEach(System.out::println);
            }else{
                System.out.println("NA");
            }
        }
    }

    private static class SalesData {
        public int no;
        public int price;
        public int num;

        public SalesData(int no, int price, int num) {
            this.no = no;
            this.price = price;
            this.num = num;
        }
    }
}