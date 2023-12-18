import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        int bigTall = a[0];

        long count = 0;
        for(int i = 1; i<n; i++){
            if(bigTall > a[i]){
                int sub = bigTall - a[i];
                count += sub;
            }
            else{
                bigTall = a[i];
            }
        }
        System.out.println(count);
    }
}