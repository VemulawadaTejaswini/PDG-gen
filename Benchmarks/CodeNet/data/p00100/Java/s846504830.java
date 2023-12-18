import java.util.Hashtable;
import java.util.Scanner;


public class Main{

	public static void main(String[] args) {
		int total = 0, id =0, p=0, q = 0, i=1;
		long mul = 1;
		 Scanner sc = new Scanner(System.in);
		 while(true) {
			 total = sc.nextInt();
			 
			 if(total==0 ) {
				 return;
			 }
			 
			
			 Hashtable<Integer, Long> sales = new Hashtable<Integer, Long>();
			 for(i=1; i<=total; i++) {
				 id = sc.nextInt();
				 p = sc.nextInt();
				 q = sc.nextInt();
				 
				 mul = p*q;
				 if(sales.containsKey(id) ) {
					 if(sales.get(id).longValue() < 1000000) {
					  sales.put(id, mul + sales.get(id).longValue());
					 }
				 } else {
					 sales.put(id, mul );
				 }
				 
				
			 }
			 
			
			 boolean hasMax = false;
			 for (int key : sales.keySet()) {
				 mul = sales.get(key);
				 if(mul >= 1000000 ) {	
					 hasMax = true;
					 System.out.println(key);
				 } 
				}
			  
		 
		     if(hasMax == false) {
				 System.out.println("NA");
			 }
			 
		 }

	}

}