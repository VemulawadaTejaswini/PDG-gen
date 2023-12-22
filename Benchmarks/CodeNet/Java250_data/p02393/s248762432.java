import static java.lang.System.out;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Main test = new Main();
        List<Integer> list = test.makeList();
        Collections.sort(list);
        out.printf("%d %d %d%n", list.get(0), list.get(1), list.get(2));

    }

    public List<Integer> makeList() {
        Scanner scan = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();
        nums.add(scan.nextInt());
        nums.add(scan.nextInt());
        nums.add(scan.nextInt());

        return nums;
    }                                                                  
}