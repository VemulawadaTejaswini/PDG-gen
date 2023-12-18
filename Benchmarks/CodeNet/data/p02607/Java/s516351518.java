import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        int out = 0;
        for(int i = 0; i < n; i++){
            a[i] = scan.nextInt();
            if(i % 2 == 1 && a[i] % 2 == 1) out++;
        }
        System.out.println(out);
        scan.close();
    }
}
