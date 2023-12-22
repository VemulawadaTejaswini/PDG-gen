import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i<n; i++){
            int a = sc.nextInt();
            arr.add(a);
        }
        Collections.sort(arr);

        int ans = 0;

        for (int i = 0; i<n ; i++){
            for (int j = i+1; j<n; j++){
                for (int k = j+1; k<n; k++){
                    if (!arr.get(i).equals(arr.get(j)) && !arr.get(j).equals(arr.get(k)) && !arr.get(i).equals(arr.get(k))){
                        if (arr.get(i)+arr.get(j) > arr.get(k)){
                            ans++;
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }
}