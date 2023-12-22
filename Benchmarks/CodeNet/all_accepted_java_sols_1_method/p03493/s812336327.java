import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] params = sc.next().split("");

        int nums1 =Integer.parseInt(params[0]);
        int nums2 =Integer.parseInt(params[1]);
        int nums3 =Integer.parseInt(params[2]);

        int sum = nums1 + nums2 + nums3;
         System.out.println(sum);
    }
}