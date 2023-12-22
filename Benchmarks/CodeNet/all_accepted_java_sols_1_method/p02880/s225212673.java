import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
      	boolean eo = false;
      	
      	for(int i = 1; i <= 9&& !eo;i++){
          if(n%i==0 && n/i <= 9) eo = true;
        }
 		
      	if(eo) System.out.println("Yes");
      	else System.out.println("No");
        
	}
}
