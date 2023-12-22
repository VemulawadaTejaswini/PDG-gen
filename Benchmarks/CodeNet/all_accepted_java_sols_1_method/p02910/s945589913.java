import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String[] s = in.nextLine().split("");

        for( int i = 0 ; i < s.length ; i++ ){
            if( i % 2 == 0 ){
                if( "R".equals(s[i]) || "U".equals(s[i]) || "D".equals(s[i]) ){

                }
                else {
                    System.out.println("No");
                    return;
                }
            }
            else {
                if( "L".equals(s[i]) || "U".equals(s[i]) || "D".equals(s[i]) ){

                }
                else {
                    System.out.println("No");
                    return;
                }
            }
        }

        System.out.println( "Yes" );

    }

}
