import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        int n = scan.nextInt();
        int[] d = new int[n];
        int a = 0;
        for(int i = 0; i < n; i++){
            d[i] = scan.nextInt();
            
        }
        for(int i = 0; i < n - 1; i++){
            for(int j = 1; j < n - i; j++){
                a = a + d[i] * d[i + j];
            }
        }
        System.out.println(a);
    }
}