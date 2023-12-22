import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        int[] out = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = scan.nextInt();
            out[a[i] - 1] = i + 1;
        }
        for(int i = 0; i < n; i++) System.out.print(out[i] + " ");
    }
}