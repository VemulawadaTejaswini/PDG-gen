import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();
        int ans = 0;
        for (int i = 0; i<n; i++){
            int a = sc.nextInt();
            arr.add(a);
        }
        for (int i = 1; i<(n-1); i++){
            if (arr.get(i) > arr.get(i-1) && (arr.get(i) < arr.get(i+1))){
                ans++;
            }
            else if (arr.get(i) < arr.get(i-1) && (arr.get(i) > arr.get(i+1))){
                ans++;
            }
        }
        System.out.println(ans);
    }
}