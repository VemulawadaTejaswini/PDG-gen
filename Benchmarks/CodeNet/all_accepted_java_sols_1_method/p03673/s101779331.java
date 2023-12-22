import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] b = new int[n];
        int fro = n / 2 - 1;
        int bac = n / 2;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if(i % 2 != 0){
                b[fro--] = a;
            }else{
                b[bac++] = a;
            }
        }

        if(n % 2 == 0){
            for (int i = 0; i < n; i++) {
                System.out.print(b[i] + " ");
            }
        }else{
            for (int i = 0; i < n; i++) {
                System.out.print(b[n-i-1] + " ");
            }
        }
        sc.close();
    }

}
