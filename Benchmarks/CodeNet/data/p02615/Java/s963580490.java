import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int s = 0;
        for(int i = 0 ; i < n ; i++ ){
            a[i] = sc.nextInt();
            s = s + a[i];
        }
        int sa = a[0];
        for(int i = 1 ; i < n ; i++ ){
            if(sa > a[i]){
                sa = a[i];
            }
        }
        System.out.println(s - sa);
        sc.close();
    }
}