//Volume0-0063
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		//initialize
		StringBuffer sb;
		int cnt = 0;

		//input
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			sb = new StringBuffer(sc.nextLine());
			
			//calculate
			if(sb.toString().equals(sb.reverse().toString())){cnt++;}
		}
		
		//output
		System.out.println(cnt);
	}
}