import java.util.*;
 
class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n[] = new int[5];
        int min = 0 , swap = 0 , index = 0 , sum = 0;

        for ( int i = 0 ; i < 5 ; i++ ) {
            n[i] = sc.nextInt();
        }

        for ( int i = 0 ; i < 5 ; i++ ) {
            min = 9;
            for ( int j = i ; j < 5 ; j++ ) {
                if (( n[j] % 10 ) == 0) {
                    min = ( 10 - ( n[j] % 10 ) );
                    index = j;                    
                } else if ( ( 10 - ( n[j] % 10 ) ) <= min )  {
                    min = ( 10 - ( n[j] % 10 ) );
                    index = j;
                }
            }
            swap = n[i];
            n[i] = n[index];
            n[index] = swap;
        }

        for ( int i = 0 ; i < 5 ; i++ ) {
            if (i < 4){ 
                if ( (n[i] % 10) != 0) {
                    sum += n[i];
                    sum += ( 10 - ( n[i] % 10 ) );
                } else {
                    sum += n[i];
                }
            } else if (i == 4) {
                sum += n[i];
            }
        }

        System.out.println(sum);
    }
}