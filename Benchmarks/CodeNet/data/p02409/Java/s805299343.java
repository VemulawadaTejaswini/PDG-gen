import java.util.*;

public class Main {
    public static void main(String[] args){
/*
Ａ大学は１フロア１０部屋、３階建ての公舎４棟を管理しています。
公舎の入居・退去の情報を読み込み、各部屋の入居者数を出力するプログラムを作成して下さい。
n件の情報が与えられます。各情報では、
４つの整数b, f, r, vが与えられます。
これは、b棟f階のr番目の部屋にv人が追加で入居したことを示します。
vが負の値の場合、-v人退去したことを示します
*/

        Scanner scanner = new Scanner(System.in);

        List<int[][]> builds = new ArrayList<int[][]>();
        for (int i=0; i<4; i++) {
            int[][] sb = new int[3][10];
            builds.add(sb);
        }

        int n = scanner.nextInt(); // row count
        for(int i=0; i<n; i++){
            int b = scanner.nextInt(); // school building no
            int f = scanner.nextInt(); // floor no
            int r = scanner.nextInt(); // no from left
            int v = scanner.nextInt(); // add value
            builds.get(b-1)[f-1][r-1] += v;
        }
        
        for(int i=0; i<4; i++){
            for(int j=0; j<3; j++){
                for(int k=0; k<10; k++){
                    int value = builds.get(i)[j][k];
                    System.out.print(" " + value );
                }
                System.out.println();
            }
            if (i != 3) { System.out.println("####################"); }
        }

        
        
    }
}

