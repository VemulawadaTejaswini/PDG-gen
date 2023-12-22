import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        short n = scanner.nextShort();
        short m = scanner.nextShort();

        short[][] a = new short[n][m];
        short[]   b = new short[m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                a[i][j] = scanner.nextShort();
            }
        }

        for(int i = 0; i < m; i++){
            b[i] = scanner.nextShort();
        }

        int x = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                x += a[i][j]*b[j];
            }
            System.out.println(x);
            x = 0;
        }

    }
}

