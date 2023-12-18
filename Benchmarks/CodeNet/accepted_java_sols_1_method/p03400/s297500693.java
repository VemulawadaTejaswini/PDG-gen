import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int x = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int tabe = 0;
        for(int i = 0;i<d;i++){
            for(int j = 0;j<n;j++){
                if(i%a[j] == 0){
                    tabe++;
                }
            }
        }
        tabe += x;
        System.out.println(tabe);
        sc.close();
    }
}