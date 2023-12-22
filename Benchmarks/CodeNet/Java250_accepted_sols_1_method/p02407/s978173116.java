import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by khrom on 2017/06/29.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> nums = new ArrayList<>();
        int index = scanner.nextInt();
        for (int i = 0; i < index; i++) {
            nums.add(scanner.next());
        }
        StringBuilder strb = new StringBuilder();
        for (int i = nums.size() - 1; i >= 0; i--) strb.append(nums.get(i) + " ");
        strb.deleteCharAt(strb.length() - 1);
        System.out.println(strb.toString());
    }
}