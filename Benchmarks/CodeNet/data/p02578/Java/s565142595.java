import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<Integer>();

        int ans = 0;

        for (int i = 0; i<n; i++){
            arr.add(sc.nextInt());
        }

        for (int i = 1; i<n; i++){
            if (arr.get(i) < arr.get(i-1)){
                ans = ans + (arr.get(i-1)-arr.get(i));
                arr.set(i,arr.get(i-1));
            }
        }
        System.out.println(ans);
    }
}