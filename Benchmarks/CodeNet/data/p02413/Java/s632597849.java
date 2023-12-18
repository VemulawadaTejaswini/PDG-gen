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
            sum = 0;
            for(int j = 0;j < c;++j){
                int v = a[j][i];
                sum += v;
                b[j] += v;
                System.out.printf(" %d",v);
            }
            System.out.printf(" %d\n",sum);
        }
        sum = 0;
        for(int i = 0;i < c;++i){
            sum += b[i];
            System.out.printf(" %d",b[i]);
        }
        System.out.printf(" %d\n",sum);
    }

}