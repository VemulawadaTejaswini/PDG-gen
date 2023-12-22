import java.util.*;

public class Main {
	  public static void main(String args[]){
      	Scanner scan = new Scanner(System.in);
            
        int x = scan.nextInt();
        int y = scan.nextInt();
        String cnt;
        
        int x_group = 0;
        int y_group = 0;
        //1,3,5,7,8,10,12のグループを1,
        //上記でないグループを2とする。
        //2は独立してるのでグループにカウントしない
        
        if( x == 2 || y == 2 )cnt = "No";
        else{
          if( x == 4 || x == 6 || x == 9 || x == 11 ){
            x_group = 2;
          }
          else x_group = 1;
          
          if( y == 4 || y == 6 || y == 9 || y == 11 ){
            y_group = 2;
          }
          else y_group = 1;
          
          if(x_group == y_group)cnt = "Yes";
          else cnt = "No";
        
        }
            
        System.out.println(cnt);
	  }
}