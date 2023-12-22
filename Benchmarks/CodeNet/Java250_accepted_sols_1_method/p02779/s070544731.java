import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        boolean b = false;
        for(int i = 0; i < n; i++){
            a[i] = scan.nextInt();
        }
        Arrays.sort(a);
        for(int i = 0; i < n - 1; i++){
            if(a[i] == a[i + 1]){
                b = true;
                break;
            }
        }
        if(!b){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}