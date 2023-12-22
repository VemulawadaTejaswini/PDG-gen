import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int noDataSet = sc.nextInt();

        for (int i = 0; i < noDataSet; i++) {
            ArrayList<Integer> nums = new ArrayList<Integer>();
            nums.add(sc.nextInt());
            nums.add(sc.nextInt());
            nums.add(sc.nextInt());
            Collections.sort(nums);

            int a = nums.get(0);
            int b = nums.get(1);
            int c = nums.get(2);

            if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}