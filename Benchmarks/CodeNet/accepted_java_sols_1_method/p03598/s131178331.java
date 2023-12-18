import java.util.Scanner;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int loop;
        int target = 0;

        loop = sc.nextInt();
        target = sc.nextInt();

        int [] arr = new int [loop];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for(int i = 0; i < arr.length; i++) {

            if(arr[i] * 2 < (target - arr[i]) * 2) {
                sum += arr[i] * 2;
            } else {
                sum += (target - arr[i]) * 2;
            }
        }

        System.out.println(sum);

    }
}