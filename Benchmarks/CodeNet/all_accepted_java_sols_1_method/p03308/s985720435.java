import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int max = 0;
        int min = 1000000000;
        
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
            if(min > a[i]){
                min = a[i];
            }
            if(max < a[i]){
                max = a[i];
            }
        }
        System.out.println(max-min);
    }
}
