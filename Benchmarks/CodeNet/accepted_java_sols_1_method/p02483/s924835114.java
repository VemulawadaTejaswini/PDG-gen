import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> nums = new ArrayList<Integer>();
        for (int i = 0; i < 3; i++)
            nums.add(scan.nextInt());

        Collections.sort(nums);

        System.out.printf("%d %d %d\n",
                nums.get(0), nums.get(1), nums.get(2));
    }
}