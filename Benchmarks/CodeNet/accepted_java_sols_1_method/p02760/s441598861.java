import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] as = new int[3][3];
        for( int i = 0 ; i < 3 ; i++ ){
            String[] params = sc.nextLine().split(" ");
            for( int j = 0 ; j < 3 ; j++ ){
                as[i][j] = Integer.parseInt( params[j] );
            }
        }
        int n = Integer.parseInt( sc.nextLine() );
        int[] bs = new int[n];
        for( int i = 0 ; i < n ; i++ ){
            bs[i] = Integer.parseInt( sc.nextLine() );
            for( int j = 0 ; j < 3 ; j++ ){
                for( int k = 0 ; k < 3 ; k++ ){
                    if( as[j][k] == bs[i] ){
                        as[j][k] = 0;
                    }
                }
            }
        }

        // 斜めのチェック
        if( as[0][0] == 0 && as[1][1] == 0 && as[2][2] == 0 ){
            System.out.println( "Yes" );
            return;
        }
        if( as[0][2] == 0 && as[1][1] == 0 && as[2][0] == 0 ){
            System.out.println( "Yes" );
            return;
        }
        for( int i = 0 ; i < 3 ; i++ ){
            if( as[i][0] == 0 && as[i][1] == 0 && as[i][2] == 0 ){
                System.out.println("Yes");
                return;
            }
            if( as[0][i] == 0 && as[1][i] == 0 && as[2][i] == 0 ){
                System.out.println("Yes");
                return;
            }
        }

        System.out.println( "No" );

    }

}
