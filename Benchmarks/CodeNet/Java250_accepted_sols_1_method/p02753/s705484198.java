import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		String a=input.nextLine();
	
		boolean ok=false;
		for(int i=1;i<3;i++)
			if(a.charAt(0)!=a.charAt(i))
				ok=true;
		
		if(ok)
			System.out.println("Yes");
		else
			System.out.println("No");
		
	
	}
	

}
