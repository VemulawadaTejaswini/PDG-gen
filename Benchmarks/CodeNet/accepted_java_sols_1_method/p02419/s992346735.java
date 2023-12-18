import java.util.Scanner;

class Main{

	public static void main(String[] args){

		Scanner sc =new Scanner(System.in);
		
		int count=0;

		String W =sc.next().toLowerCase();
		String T;
		count=0;
		
		while(!((T=sc.next()).equals("END_OF_TEXT")))
				if((T.toLowerCase()).equals(W)) count++;
		
		System.out.println(count);
	}
	
}
