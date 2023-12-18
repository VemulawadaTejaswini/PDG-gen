

import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n;
		n = scan.nextInt();

		
		for(int count = 1 ; count<= n ;count++){
			if ( (count % 3 == 0) ){
				sb.append(" ");
				sb.append(count);
			}else if(count % 10 == 3){
				sb.append(" ");
				sb.append(count);
			}
			
		}
		
		System.out.println(new String(sb));
		
	}
}