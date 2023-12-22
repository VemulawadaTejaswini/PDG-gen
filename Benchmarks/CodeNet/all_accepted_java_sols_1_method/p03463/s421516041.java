import java.util.*;
 
public class Main {
 
	static Main instance = new Main();
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
      
          if((B-A-1)%2==0){
				System.out.print("Borys");
	      }else{
				System.out.print("Alice");
	      }
	}
}