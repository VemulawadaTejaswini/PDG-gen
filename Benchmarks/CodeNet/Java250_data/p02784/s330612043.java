import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int n = sc.nextInt();
        String ans = "Yes";
        int a[] = new int[n]; 
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            //System.out.println("a[i]"+a[i]);
        }
        double sum = 0;
        for(int i = 0; i < a.length; i++){
            sum += a[i];
            //System.out.println("sum"+sum);
            
        }
        if(sum < h){
                ans = "No";
        }
        System.out.println(ans);
    }
}