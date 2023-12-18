import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n = in.nextInt();
        int [] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = in.nextInt();
        int sum = 0;
        for (int i = 1; i < n-1; i++){
            int [] new_a = {a[i-1], a[i], a[i+1]};
            Arrays.sort(new_a);
            if (new_a[1] == a[i]){
                sum++;
            }
        }
        System.out.println(sum);
    }
}