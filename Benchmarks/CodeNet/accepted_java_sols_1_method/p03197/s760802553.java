import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        boolean first = false;
        for(int i=0; i<n; i++){
            a[i] = sc.nextLong();
            if(a[i] % 2 == 1) first = true;
        }
        sc.close();

        if(first){
            System.out.println("first");
        }else{
            System.out.println("second");
        }
    }
}