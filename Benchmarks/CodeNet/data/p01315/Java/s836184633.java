import java.util.*;
import java.util.stream.Stream;

public class Main {
    static class Product implements Comparable<Product> {
        String label;
        double incomeRate;

        Product(String l, int p, int a, int b, int c, int d, int e, int f, int s, int m) {
            this.label = l;
            this.incomeRate = (double)(f * s * m - p) / (a + b + c + (d + e) * m);
        }

        public String getLabel() {
            return this.label;
        }

        @Override
        public int compareTo(Product o) {
            if (this.incomeRate > o.incomeRate)
                return 1;
            else if (this.incomeRate < o.incomeRate)
                return -1;
            return o.label.compareTo(this.label);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        String[] input;
        int[] params;
        String label;
        List<Product> products;
        while (true) {
            n = Integer.parseInt(sc.nextLine().trim());
            if (n == 0) break;
            products = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                input = sc.nextLine().trim().split(" ");
//                System.out.println(Arrays.toString(input));
                label = input[0];
                params = Stream.of(Arrays.copyOfRange(input, 1, input.length)).mapToInt(Integer::parseInt).toArray();
//                System.out.println(Arrays.toString(params));

                products.add(new Product(label, params[0], params[1], params[2], params[3], params[4], params[5], params[6], params[7], params[8]));
            }
//            System.out.println(products.size());

            Collections.sort(products);
            for (int i = 0; i < n; i++) {
                System.out.println(products.get(n-i-1).getLabel());
            }
            System.out.println("#");
        }
    }
}