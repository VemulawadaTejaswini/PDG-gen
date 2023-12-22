import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str;
        int i,j,sum;
        int[] num = new int[2];
        int[][] a;
        int[] b;
        str = scan.nextLine();
        String[] x = str.split(" ", 0);
        num[0] = Integer.valueOf(x[0]);
        num[1] = Integer.valueOf(x[1]);
        a = new int[num[0]][num[1]];
        b = new int[num[1]];
        for(i = 0; i < num[0]; i++){
            str = scan.nextLine();
            x = str.split(" ", 0);
            for(j = 0; j < num[1]; j++){
                a[i][j] = Integer.valueOf(x[j]);
            }
        }
        for(j = 0; j < num[1]; j++){
            str = scan.nextLine();
            b[j] = Integer.valueOf(str);
        }
        sum = 0;
        for(i = 0; i < num[0]; i++){
            for(j = 0; j < num[1]; j++){
                sum += a[i][j] * b[j];
            }
            System.out.println(sum);
            sum = 0;
        }
        
        scan.close();
    }
}
