import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i<n; i++){
            int a = sc.nextInt();
            arr.add(a);
        }
        int sum = 0;
        Collections.sort(arr);
        for (int i = (n-k); i<n; i++){
            sum+=arr.get(i);
        }
        System.out.println(sum);

    }
}