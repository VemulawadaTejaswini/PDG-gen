import java.util.Scanner;

public class Main {

    /*
     * 行列の積
     * 
     * n×m の行列 A と m×l の行列 B を入力し、それらの積である n×l の行列 C を出力するプログラムを作成してください。行列 C
     * の各要素 cij は次の式で得られます：
     * 
     * cij=?k=1maikbkj ここで、A、B、C の各要素をそれぞれ aij、bij、cij とします。
     * 
     * Input １行目に n、m、l が空白区切りで与えられます。
     * 
     * 続く行に n×m の行列 A と m×l の行列 B が与えられます。
     * 
     * Output n×l の行列 C の要素 cij を出力してください。各行の隣り合う要素を１つの空白で区切ってください。
     * 
     * Constraints 1?n,m,l?100 0?aij,bij?10000
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int l = sc.nextInt();

        int[][] array1 = new int[n][m];
        int[][] array2 = new int[m][l];

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                array1[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                array2[i][j] = sc.nextInt();
            }
        }
        
        sc.close();
        long[][] array3 = new long[n][l];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < l; j++) {
                for (int j2 = 0; j2 < m; j2++) {
                    array3[i][j] += array1[i][j2]*array2[j2][j];
                }
            }
        }
        
        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[i].length; j++) {
                System.out.print(array3[i][j]);
                if(j != l -1){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}