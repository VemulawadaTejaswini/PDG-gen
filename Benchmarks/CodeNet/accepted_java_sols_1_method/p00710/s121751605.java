import java.util.Scanner;

public class Main {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        while(true){
            int n = sc.nextInt();
            int r = sc.nextInt();
            if(n == 0 && r == 0) break;
            int[] x = new int[n];
            int[] y = new int[n];
            int p,c;
            for(int i =0 ; i< n; i++){
                x[i] = n-i;
                y[i] = x[i];
            }
            for(int i = 0; i < r; i++){
                p = sc.nextInt();
                c = sc.nextInt();
                for(int j = 0; j<c; j++){
                    x[j] = y[p-1+j];
                }
                for(int j = c; j < p+c-1; j++){
                    x[j] = y[j-c];
                }
                for(int j = 0; j<n; j++){
                    y[j] = x[j];
                }
            }
            System.out.println(x[0]);
        }

        sc.close();
    }
}
