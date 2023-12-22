import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] a = new int[2][n];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = scanner.nextInt();
            }
        }
        int msxSum=0;
        for(int i=0;i<n;i++){
            int total=0;
            for(int j=0;j<=i;j++){
                total+=a[0][j];
            }
            for(int k=i;k<n;k++){
                total+=a[1][k];
            }
            if(msxSum<=total){
                msxSum=total;
            }
        }
        System.out.println(msxSum);
    }
}
