import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
       int n = Integer.parseInt(sc.next());
       int[] num = new int[n];
       for(int i = 0; i < n; i++){
           num[i] = Integer.parseInt(sc.next());
       }
       Arrays.sort(num);
       System.out.println(num[n-1]-num[0]);
    }
}