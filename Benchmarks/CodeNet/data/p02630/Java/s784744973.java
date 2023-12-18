import java.util.*;

public class Main {

    public static void main(String args[]) {


        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        List<Integer> list = new ArrayList<>();
        List<Long> sumList = new ArrayList<>();
        long sum =0;

        for (int i = 0; i < n; i++) {
            int a = scan.nextInt();
            sum+= a;
            list.add(a);
        }

        Collections.sort(list);

        int q = scan.nextInt();

        for (int j = 0;j<q; j++ ) {
            int b = scan.nextInt();
            int c = scan.nextInt();

            Collections.sort(list);

            if (Collections.binarySearch(list, b) >=0) {

                int lowerResult = ~Collections.binarySearch(list, b, (x, y) -> x.compareTo(y) >= 0 ? 1 : -1);
                int upperResult = ~Collections.binarySearch(list, b, (x, y) -> x.compareTo(y) > 0 ? 1 : -1);

                if (Collections.binarySearch(list, b+1) >=0) {
                    for (int k = lowerResult; k < upperResult; k++) {
                        if (list.get(k) == b) {
                            list.set(k, c);
                            sum = sum + c - b;
                        }
                    }
                } else {
                    for (int k = lowerResult; k <n; k++) {
                        if (list.get(k) == b) {
                            list.set(k, c);
                            sum = sum + c - b;
                        }
                    }
                }
            }

            sumList.add(j, sum);
        }


        for(long i: sumList) {
            System.out.println(i);
        }
    }


}