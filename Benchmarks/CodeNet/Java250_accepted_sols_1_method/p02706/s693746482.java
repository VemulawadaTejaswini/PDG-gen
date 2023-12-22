import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[m];
        for(int i = 0 ; i < m ; i++ ){
            a[i] = sc.nextInt();
            n -= a[i];
        }
        if(n < 0){
            System.out.println(-1);
        }else{
            System.out.println(n);
        }
        sc.close();
    }
}