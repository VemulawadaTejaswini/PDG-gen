import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
         
        Scanner sc = new Scanner(System.in);
         String W = sc.next();
         W = W.toUpperCase();
         int count=0;

        while( true ){
            String T = sc.next();
            if( T.equals( "END_OF_TEXT" ) )
                break;
            T = T.toUpperCase();
            if(T.equals(W)){
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}


