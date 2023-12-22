import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int l = scanner.nextInt();

        long[][] a = new long[n][m];
        long[][] b = new long[m][l];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                a[i][j] = scanner.nextInt();
            }
        }
        for(int i = 0; i < m; i++){
            for(int j = 0; j < l; j++){
                b[i][j] = scanner.nextInt();
            }
        }
        long product;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < l; j++){
                product = 0;
                for(int k = 0; k < m; k++){
                    product += a[i][k]*b[k][j];
                }
                if(j != l-1)System.out.print(product+" ");
                else System.out.println(product);
            }
        }
    }
}

