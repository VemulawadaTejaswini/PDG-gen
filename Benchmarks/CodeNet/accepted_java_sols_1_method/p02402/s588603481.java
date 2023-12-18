import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        long max, min, sum = 0;
        ArrayList<Integer> z = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            z.add(scan.nextInt());
            sum += z.get(i);
//            a[i] = scan.nextInt();
        }
        max = Collections.max(z);
        min = Collections.min(z);

//        max = a[0];
//        min = a[0];

        /*for (int num : a) {
            if (max < num) {
                max = num;
            } else if (min > num) {
                min = num;
            }
            sum += num;
        }*/
        System.out.println(min + " " + max + " " + sum);
    }
}