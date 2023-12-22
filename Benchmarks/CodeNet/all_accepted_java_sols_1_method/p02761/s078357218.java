import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] params = sc.nextLine().split(" ");
        int n = Integer.parseInt( params[0] );
        int m = Integer.parseInt( params[1] );
        int[] ss = new int[m];
        int[] cs = new int[m];
        boolean isNg = false;
        for( int i = 0 ; i < m ; i++ ){
            params = sc.nextLine().split(" ");
            ss[i] = Integer.parseInt( params[0] );
            cs[i] = Integer.parseInt( params[1] );
            for( int j = 0 ; j < i ; j++ ){
                if( isNg ){
                    break;
                }
                if( ss[j] == ss[i] ){
                    if( cs[j] != cs[i] ){
                        isNg = true;
                        break;
                    }
                }
            }
        }

        if( isNg ){
            System.out.println(-1);
            return;
        }

        if( n == 1 ){
            int min = 0;
            for( int i = 0 ; i < m ; i++ ){
                    min = cs[i];
            }
            System.out.println( min );
            return;
        }

        if( n == 2 ){
            int ans = 10;
            for( int i = 0 ; i < m ; i++ ){
                if( ss[i] == 2 ){
                    ans = ans / 10 * 10 + cs[i];
                }
                if( ss[i] == 1 ){
                    if( cs[i] == 0 ){
                        System.out.println(-1);
                        return;
                    }
                    ans = cs[i] * 10 + ans % 10;
                }
            }
            System.out.println( ans );
            return;
        }

        if( n == 3 ){
            int ans = 100;
            for( int i = 0 ; i < m ; i++ ){
                if( ss[i] == 3 ){
                    ans = ans / 10 * 10 + cs[i];
                }
                if( ss[i] == 2 ){
                    ans = ans / 100 * 100 + cs[i] * 10 + ans % 10;
                }
                if( ss[i] == 1 ){
                    if( cs[i] == 0 ){
                        System.out.println(-1);
                        return;
                    }
                    ans = cs[i] * 100 + ans % 100;
                }
            }
            System.out.println( ans );
        }

    }

}

