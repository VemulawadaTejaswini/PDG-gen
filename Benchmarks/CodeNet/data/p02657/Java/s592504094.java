import java.util.*;
import java.lang.Math;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

  		int num = sc.nextInt(); 
      	long ans = 1;
      	boolean con = true;
      
      	for(int i = 0;i < num; i++) {
          ans *= sc.nextLong();
        }
      
      	if(Math.log(ans) > 18) con = false;
      	
      	if(con) System.out.println(ans);
      	else System.out.println(-1);
        
	}
}
