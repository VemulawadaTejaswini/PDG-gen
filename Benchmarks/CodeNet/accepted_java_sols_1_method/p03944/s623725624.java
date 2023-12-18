import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int H = sc.nextInt();
        int N = sc.nextInt();


        int left  = 0 ;
        int right = W ;
        int down  = 0 ;
        int up    = H ;


        for(int i = 0 ; i < N ; i ++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int a = sc.nextInt();

            switch( a ){
                case 1:
                    if( x >= left ){
                        left = x ;
                    }
                    break;

                case 2:
                    if( x <= right ){
                        right = x ;
                    }
                    break;
                case 3:
                    if( y >= down ){
                        down = y ;
                    }
                    break;
                case 4:
                    if( y <= up ){
                        up = y ;
                    }
                    break;
            }
        }

        int result = 0;
        if(left < right && down < up){
            result = (right - left) * ( up - down ) ;
        }

        System.out.println(result);

    }
}
