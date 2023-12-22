//Volume0-0060
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		//declare
		String[] s;
		int C1,C2,C3,less;
		
		//input
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			s = sc.nextLine().split("\\s");
			C1 = Integer.parseInt(s[0]);
			C2 = Integer.parseInt(s[1]);
			C3 = Integer.parseInt(s[2]);

			//calculate
			less=0;
			for(int i=1;i<=10;i++){
				if(i != C1 &&
				   i != C2 &&
				   i != C3 &&
				   i + C1 + C2 <= 20 ){
						less++;
				}
			}
			
			//output
			if   (3 < less){System.out.println("YES");}
			else           {System.out.println("NO"); }
		}
	}
}