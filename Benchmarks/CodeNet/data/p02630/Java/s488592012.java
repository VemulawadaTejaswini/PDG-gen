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
            int x = 0;


            for (int k =0; k<n; k++) {

                if (list.get(k) == b) {
                    list.set(k, c);
                    sum = sum + c - b;
                }

            }

            sumList.add(j, sum);
        }


        for(long i: sumList) {
            System.out.println(i);
        }
    }


}