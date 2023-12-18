import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        if(n == 0) {
            System.out.println(x);
            return;
        }
        int[]p = new int [101];
        for(int i=0; i<n; i++) {
            p[sc.nextInt()] = 1;
        }
        for(int i=0; i<101; i++) {
            if(x-i >= 0) {
                if(0 == p[x-i]) {
                    System.out.println(x-i);
                    return;
                }
            }else {
                System.out.println(-1);
            }
            if(x+i <=100) {
                if(0 == p[x+i]) {
                    System.out.println(x+i);
                    return;
                }
            }
        }
    }
}