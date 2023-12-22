import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i<n; i++){
            int a = sc.nextInt();
            arr.add(a);
        }

        Collections.sort(arr);
        int sum = 0;
        for (int i = 0; i<(n-1); i++){
            sum+=arr.get(i);
        }
        if (sum > arr.get(n-1)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}