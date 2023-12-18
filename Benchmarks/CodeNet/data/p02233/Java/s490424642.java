import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        
        int[] arr = new int[45];
        arr[0] = 1;
        arr[1] = 1;
        
        for (int i = 2; i < 45; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
        
        System.out.println(arr[in.nextInt()]);
    }
}

