import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        int sum = 0;
        
        for( int a = 1; a < 10; a++ ) {
            for( int b = 0; b < 10; b++ ) {
                for( int c = 0; c < 10; c++ ){
                    String strNum = String.valueOf(a) + String.valueOf(b) + String.valueOf(c) + String.valueOf(b) + String.valueOf(a);
                    int num = Integer.parseInt( strNum );
                    if( A <= num && num <= B ) {
                        sum++;
                    }
                }
            }
        }
        
        System.out.println(sum);
        
    }
}
