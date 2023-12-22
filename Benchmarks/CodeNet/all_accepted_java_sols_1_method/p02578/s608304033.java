import java.util.*;

public class Main{
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
           arr[i] = in.nextInt();

        long count = 0;
        int max = arr[0];
        for(int i = 1; i < n; i++){
            if(arr[i] < max)
                count += (max - arr[i]);
            max = Math.max(max, arr[i]);
        }
        System.out.println(count);
    }
}
