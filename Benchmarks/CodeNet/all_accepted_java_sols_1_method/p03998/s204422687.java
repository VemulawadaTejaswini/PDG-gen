import java.util.*;

public class Main {
	  public static void main(String args[]){
      	Scanner scan = new Scanner(System.in);
            
        String Sa = scan.next();
        String Sb = scan.next();
        String Sc = scan.next();
        
        char isNext = 'a';//次のターンは誰か、格納
        char cnt;
        
        while( Sa.length() != 0 || Sb.length() != 0 || Sc.length() != 0 ){
          if( isNext == 'a' && Sa.length() >= 1){
            isNext = Sa.substring(0, 1).charAt(0);
            Sa = Sa.substring(1, Sa.length() );
          }
          else if( isNext == 'a' && Sa.length() == 0 )break;
          
          else if( isNext == 'b' && Sb.length() >= 1){
            isNext = Sb.substring(0, 1).charAt(0);
            Sb = Sb.substring(1, Sb.length() );
          }
          else if( isNext == 'b' && Sb.length() == 0 )break;
          
          else if( isNext == 'c' && Sc.length() >= 1){
            isNext = Sc.substring(0, 1).charAt(0);
            Sc = Sc.substring(1, Sc.length() );
          }
          else if( isNext == 'c' && Sc.length() == 0 )break;
        }
        
        if( isNext == 'a' && Sa.length() == 0)System.out.println("A");
        else if( isNext == 'b' && Sb.length() == 0)System.out.println("B");
        else if( isNext == 'c' && Sc.length() == 0)System.out.println("C");
        
	  }
}