

import java.util.*;

public class Main {
	
	public static void main(String args[]){
		
		//A
		Scanner sc= new Scanner(System.in);
		int x= sc.nextInt();
		String ans = "NO";
		
		if(x==7 || x==5 || x==3){
			ans = "YES";
		}
		
		System.out.println(ans);
	}

}
