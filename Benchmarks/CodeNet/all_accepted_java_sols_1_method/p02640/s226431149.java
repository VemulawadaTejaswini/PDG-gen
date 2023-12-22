import java.util.*;

public class Main{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        int x  = sc.nextInt();
        int y  = sc.nextInt();
        
        if(y % 2 != 0){
           System.out.println("No");
        }else if((y == 2 || y == 4) && x == 1){
           System.out.println("Yes");
        }else{
          int kame = x*4-y;
          int turu = y-x*2;
          if(kame >=0 && turu >=0 ){
            System.out.println("Yes");
          }else{
            System.out.println("No");
          }
        }
        
	}
}