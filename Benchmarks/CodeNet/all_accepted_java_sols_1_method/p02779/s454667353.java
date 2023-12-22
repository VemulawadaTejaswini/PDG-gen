import java.math.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int list[]=new int[n];
        for (int i = 0; i < n; i++)
            list[i] = sc.nextInt();
        Arrays.sort(list);
        String ans="YES";
        for (int i = 0; i < n - 1; i++) {
            if (list[i] == list[i + 1]) {
                ans = "NO";
                break;
            }
        }
        System.out.println(ans);
    }
}