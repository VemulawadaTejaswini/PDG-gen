import java.util.*;
public class Main{ 
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in); 
		while(sc.hasNext()){
		long a = sc.nextLong();
		long b = sc.nextLong();
		long cost = 0;
		if(a == 1){ cost = 6000 * b;}
		if(a == 2){ cost = 4000 * b;}
		if(a == 3){ cost = 3000 * b;}
		if(a == 4){ cost = 2000 * b;}
		System.out.println(cost);
		}
		
	}
	}	