import java.util.*;
public class Main {
  	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      int k = sc.nextInt();
      int ok = 0;
      while(k>0){
		  if(a >= b){
    	    b = b * 2;
        	k--;
	      }
          if(b >= c){
            if(k==0){
              break;
            } else {
	            c = c * 2;
	            k--;
            }
          }
//        System.out.println(k);
        if(a < b){
          if(b < c){
            System.out.println("Yes");
            ok = 1;
            break;
          }
        }
      }
      if(ok==0){
        System.out.println("No");
      }
    }
}