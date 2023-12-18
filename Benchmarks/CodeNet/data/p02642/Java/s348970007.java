import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        boolean d = false;
        for(int i = 0; i < n; i++){
            a[i] = scan.nextInt();
        }
        Arrays.sort(a);
        for(int i = 0; i < n - 1; i++){
            if(a[i] == a[i + 1]){
                d = true;
                break;
            }
        }
        int out = n;
        for(int i = 1; i < n; i++){
            for(int j = 0; j < i; j++){
                if(a[i] % a[j] == 0 && i != j){
                    out--;
                    break;
                }
            }
        }
        System.out.println(d ? out - 1 : out);
        scan.close();
    }
}