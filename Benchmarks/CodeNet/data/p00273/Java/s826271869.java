import java.util.*;
public class Main{ 
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in); 
		while(sc.hasNext()){
			long hi = sc.nextInt();
			for(int count = 0; count < hi; count ++){
				double x = sc.nextLong();
				double y = sc.nextLong();
				long b = sc.nextLong();
				long p = sc.nextLong();
				if(b >= 5 && p >=2){ x = x * 0.8; y = y * 0.8;} 			
				double cost = x * b + y * p;
				long henkan = (long)cost;
				System.out.println(henkan);
			}
		
		}
	}
	
}