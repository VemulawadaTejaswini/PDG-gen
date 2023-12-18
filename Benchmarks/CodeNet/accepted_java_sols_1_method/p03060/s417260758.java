import java.util.Scanner;

public class Main {
    static int a[] = new int[110];
    static int b[] = new int[110];
    public static void main(String args[]){
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        for(int i = 1; i <= n; i++) a[i] = cin.nextInt();
        int res = 0;
        for(int i = 1; i <= n; i++){
            b[i] = cin.nextInt();
            if(a[i] - b[i] > 0) res += a[i] - b[i];
        }
        System.out.println(res);
    }

}