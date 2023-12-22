import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());

        int[] a = new int[n - 1];
        for(int i = 0; i < n - 1; i++)
            a[i] = Integer.parseInt(sc.next());

        
        int[] ans = new int[n];
        for(int i = 0; i < n - 1; i++)
            ans[a[i] - 1]++;

        

        for(int i = 0; i < n; i++)
            System.out.println(ans[i]);
    }
}