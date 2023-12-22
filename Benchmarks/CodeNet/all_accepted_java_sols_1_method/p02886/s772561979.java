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
        for (int i = 0; i<n; i++){
            for (int j = i+1; j<n; j++){
                ans = ans + arr.get(i)*arr.get(j);
            }
        }
        System.out.println(ans);
    }
}