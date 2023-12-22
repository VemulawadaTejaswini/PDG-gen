import java.util.*;
 
public class Main {
 
	static Main instance = new Main();
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
        long h = sc.nextLong();
        
        if(h == 1){
          System.out.println(1);
          return;
        }else{
          long n = 1;
          long ans = 0;
          while(true){
            if(h > 1){
              ans+=n;
              n = n*2;
              h = h/2;
            }else{
              ans+=n;
              break;
            }
          }
          
           System.out.println(ans);
        }
	}
}