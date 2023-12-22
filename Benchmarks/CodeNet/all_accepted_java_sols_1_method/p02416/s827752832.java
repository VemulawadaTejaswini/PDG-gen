import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
         
        Scanner sc = new Scanner(System.in);
        
        while( true ){
        
            String T = sc.next();
            int sum=0;
            
            if( T.equals("0") )
                break;

            for(int i=0;i<T.length();i++){
                sum += Character.getNumericValue(T.charAt(i)) ;
              }
            
                   System.out.print(sum);
            sum=0;
             System.out.println();
            }
        sc.close();
    }
}
