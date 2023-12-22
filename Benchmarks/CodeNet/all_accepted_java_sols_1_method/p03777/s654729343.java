import java.util.Scanner;
class Main{
	
	
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			//Input
			boolean A=sc.next().equals("H");
			boolean B=sc.next().equals("H");
			//calculate
			
			
			System.out.println((!(A^B))?"H":"D");
		
			
			
		}
	}
}
