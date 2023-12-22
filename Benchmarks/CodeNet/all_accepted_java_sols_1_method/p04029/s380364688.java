import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a[] = new int[N];
        a[0] = 1;
        int total = 0;
        for(int i =1; i < a.length; ++i){
            a[i] = a[i-1]+1;
            total += a[i];
        }
        System.out.println(total + a[0]);
    }
}