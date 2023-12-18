import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        int i = 0;
        int txor = 0;
        for(i = 0 ; i < n ; i++){
            arr[i] = in.nextInt();
            txor = txor ^ arr[i];
        }
        for(i = 0 ; i < n ; i++){
            System.out.println(txor ^ arr[i]);
        }

    }
}