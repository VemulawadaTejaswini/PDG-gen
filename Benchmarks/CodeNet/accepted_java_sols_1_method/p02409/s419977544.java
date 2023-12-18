import java.util.Scanner;

public class Main {

    public static void main(String[] args)throws Exception {

        /*
         * Ａ大学は１フロア１０部屋、
         * ３階建ての公舎４棟を管理しています。公舎の入居・退去の情報を読み込み、各部屋の入居者数を出力するプログラムを作成して下さい。
         * 
         * n件の情報が与えられます。各情報では、４つの整数b, f, r,
         * vが与えられます。これは、b棟f階のr番目の部屋にv人が追加で入居したことを示します。vが負の値の場合、v人退去したことを示します。
         * 
         * 最初、全ての部屋には誰も入居していないものとします。 最初の行に情報の数 n が与えられます。
         * 
         * 続いて n 件の情報が与えられます。各情報には４つの整数 b, f, r, v が空白区切りで１行に与えられます。
         */
        int[][][] array_House = new int[4][3][10];

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int x = 0; x < n; x++) {
            int b = sc.nextInt() - 1;
            int f = sc.nextInt() - 1;
            int r = sc.nextInt() - 1;
            int v = sc.nextInt();
            if(array_House[b][f][r] + v > 9){
                array_House[b][f][r] = 9;
            }else if(array_House[b][f][r] < 0){
                array_House[b][f][r] = 0;
            }else{
                array_House[b][f][r] += v;
            }
        }
        sc.close();

        for (int i = 0; i < array_House.length; i++) {
            for (int j = 0; j < array_House[i].length; j++) {
                for (int j2 = 0; j2 < array_House[i][j].length; j2++) {

                    System.out.print(" " + array_House[i][j][j2]);

                }
                System.out.println();
            }
            if (i < array_House.length - 1) {
                System.out.println("####################");
            }
        }

    }
}