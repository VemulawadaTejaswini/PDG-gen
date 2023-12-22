import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
            int[] arr = new int[5];
            arr[0] = scn.nextInt();
            arr[1] = scn.nextInt();
            arr[2] = scn.nextInt();
            arr[3] = scn.nextInt();
            arr[4] = scn.nextInt();
               Arrays.sort(arr);
            System.out.println(arr[4] + " " + arr[3] + " " + arr[2] + " "
+ arr[1] + " " + arr[0]);
     }
}