
import java.util.Scanner;

/**
 *
 * @author chuan
 */
public class Main {
      
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in) ;
            String s = sc.nextLine().trim() ;
            char c = s.charAt( s.length()-1);
            switch(c){
                  case '2':
                  case '4':
                  case '5':
                  case '7':
                  case '9':
                        System.out.println("hon");
                        break ;
                  case '0':
                  case '1':
                  case '6':
                  case '8':
                        System.out.println("pon");
                        break;
                  case '3':
                        System.out.println("bon");
                        
            }
            
      }
      
}
