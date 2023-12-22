import java.util.Scanner;
public class Main{
    public static void main(String[] args) throws Exception {
         
        Scanner sc = new Scanner(System.in);
        
        String W = sc.next();
        int count = 0;
        W = W.toUpperCase();
        
        
        while(true){
            String T = sc.next();
            if( T.equals( "END_OF_TEXT" ) )
                break;
            T = T.toUpperCase();
            if( T.equals(W))
                count++;
        }
        System.out.println(count);
        sc.close();
    }
}

