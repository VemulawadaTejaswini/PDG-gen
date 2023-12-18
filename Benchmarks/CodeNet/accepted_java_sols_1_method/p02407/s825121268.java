import java.util.*;

public class Main {
    static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        
        int[] arr = new int[scanner.nextInt()];
        
        for(int i = 0; i < arr.length; ++i) {
            arr[i] = scanner.nextInt();
        }
        
        for(int i = arr.length - 1; i >= 0; --i) {
            System.out.print(arr[i] + (i != 0 ? " " : ""));
        }
        System.out.println();
    }
}
