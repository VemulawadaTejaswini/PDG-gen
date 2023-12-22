
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), x = sc.nextInt();
        int[] c = new int[n];
        int[][] a = new int[n][m];
        for(int i=0;i<n;i++){
            c[i] = sc.nextInt();
            for(int j=0;j<m;j++){
                a[i][j] = sc.nextInt();
            }
        }

        //2^12=4096なので総当たりでいい。

        int size = (int)Math.pow(2, n);
        int[] bin = new int[n];
        for(int i=0;i<n;i++){
            bin[i] = (int)Math.pow(2, i);
        }

        int[] skill;
        int expense;
        int min = 99999999;
        for(int i=0;i<size;i++){
            skill = new int[m];
            expense = 0;
            for(int j=0;j<n;j++){
                if((i & bin[j]) == 0){
                    continue;
                }
                expense += c[j];
                for(int k=0;k<m;k++){
                    skill[k] += a[j][k];
                }
            }

            for(int k=0;k<m;k++){
                if(skill[k] < x){
                    break;
                }
                if(k == m-1 && expense < min){
                    min = expense;
                }
            }
        }
        System.out.println(min == 99999999 ? -1 : min);
    }
}