import java.lang.Math;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(sn.nextInt());
        nums.add(sn.nextInt());
        nums.add(sn.nextInt());
        Collections.sort(nums);
        System.out.println(String.format("%d %d %d", nums.get(0), nums.get(1), nums.get(2)));
    }
}