import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt(),c = sc.nextInt(),sum;
        int[][] a = new int[c][r];
        for(int i = 0;i < r;++i){
            for(int j = 0;j < c;++j) a[j][i] = sc.nextInt();
        }
        int[] b = new int[c];
        for(int i = 0;i < r;++i){
            sum = a[0][i];
            b[0] += a[0][i];
            System.out.print(a[0][i]);
            for(int j = 1;j < c;++j){
                int v = a[j][i];
                sum += v;
                b[j] += v;
                System.out.printf(" %d",v);
            }
            System.out.printf(" %d\n",sum);
        }
        sum = b[0];
        System.out.print(b[0]);
        for(int i = 1;i < c;++i){
            sum += b[i];
            System.out.printf(" %d",b[i]);
        }
        System.out.printf(" %d\n",sum);
    }

}