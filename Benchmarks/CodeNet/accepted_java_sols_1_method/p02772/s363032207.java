import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        boolean out = true;
        for(int i = 0; i < n; i++){
            a[i] = scan.nextInt();
            if(a[i] % 2 == 0 && a[i] % 3 != 0 && a[i] % 5 != 0) out = false;
        }
        System.out.println(out ? "APPROVED" : "DENIED");
    }
}