import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //        ArrayList<Integer> all = new ArrayList<Integer>();
        //        ArrayList<Integer> total = new ArrayList<Integer>();
        ArrayList<Object> aveAll = new ArrayList<Object>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            ArrayList<Integer> all = new ArrayList<Integer>();
            ArrayList<Integer> total = new ArrayList<Integer>();
            //            ArrayList<Integer> aveAll = new ArrayList<Integer>();

            String num = scanner.next();
            int conNum = Integer.parseInt(num);

            String max = scanner.next();
            int maxBuy = Integer.parseInt(max);

            if (conNum == 0 && maxBuy == 0) {
                break;
            }

            for (int i = 0; i < conNum; i++) {
                String each = scanner.next();
                int eachPrice = Integer.parseInt(each);
                all.add(eachPrice);
            }

            for (int i = 0; i < all.size(); i++) {
                for (int j = i + 1; j < all.size(); j++) {
                    int priceTotal = all.get(i) + all.get(j);
                    if (priceTotal <= maxBuy) {
                        total.add(priceTotal);
                    }
                }
            }

            if(total.size() == 0) {
                aveAll.add("NONE");
            } else {

                Optional<Integer> maxTotal = total.stream()
                        .max((a, b) -> a.compareTo(b));
                aveAll.add(maxTotal.get());
            }

            //            System.out.println(maxTotal.get());
        }
        //        Optional<Integer> maxTotal = total.stream()
        //                .max((a, b) -> a.compareTo(b));

        for (int i = 0; i < aveAll.size(); i++) {
            System.out.println(aveAll.get(i));

        }
    }

}

