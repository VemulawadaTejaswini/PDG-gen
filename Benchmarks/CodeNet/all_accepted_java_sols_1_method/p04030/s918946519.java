import java.util.*;

public class Main {
	  public static void main(String args[]){
      	Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("");
            
        String s = scan.next();
        String cnt = "";
        int i;
        
        for( i = 0 ; i < s.length() ; i++ ){
          if( s.substring(i,i+1).charAt(0) == '0' )sb.insert( sb.length() , "0");
          else if( s.substring(i,i+1).charAt(0) == '1' )sb.insert( sb.length() , "1");
          else{
            if( sb.length() == 0 ){//何もしない
            }
            else if( sb.length() == 1 ){
              sb.setLength(0);
            }
            else{
              sb.setLength( sb.length()-1 );
            }
              
          }

        }
        
        System.out.println(new String(sb));
	  }
}