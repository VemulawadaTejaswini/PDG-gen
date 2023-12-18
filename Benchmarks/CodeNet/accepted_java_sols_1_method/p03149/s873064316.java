import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()};
        Arrays.sort(arr);
        int[] ok = {1,4,7,9};
        System.out.println(Arrays.equals(arr, ok) ? "YES" : "NO");
    }
}