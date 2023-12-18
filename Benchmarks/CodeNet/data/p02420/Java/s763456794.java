import java.util.Scanner;

public class Main {

	public static void main(String args[]){
		
		
		Scanner sc =new Scanner(System.in);
		StringBuilder result = new StringBuilder();

		while(sc.hasNext()){
			
			String deck = sc.next();

			if("-".equals(deck)){
				break;
			}
			
			int    shufleNumbers = Integer.parseInt(sc.next());
			
			for(int i=0;i<shufleNumbers;i++){
				
				int count = Integer.parseInt(sc.next());
				deck =  deck.substring(count) +deck.substring(0,count);
				
			}
			
			result.append(deck + System.lineSeparator());
			
		}
		
		System.out.print(result);
		
		sc.close();
	}

}

