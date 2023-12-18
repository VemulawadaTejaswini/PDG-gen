import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Integer> nums = new ArrayList<>();
        for(int i = 0;i < n;i++) {
            nums.add(sc.nextInt());
        }
        Collections.sort(nums);
        int n1 = nums.get(n / 2 - 1);
        int n2 = nums.get(n / 2);
        System.out.println(n2 - n1);
    }
}