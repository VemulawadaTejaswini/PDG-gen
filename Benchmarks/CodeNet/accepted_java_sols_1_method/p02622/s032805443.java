import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) throws Exception{
		Scanner sc= new Scanner(System.in);
		String n= sc.nextLine();
		
		String n2= sc.nextLine();
		int count=0;
		for(int i=0; i<n.length(); i++) {
			if(n.charAt(i)!=n2.charAt(i))
			count++;
		}
		
		System.out.println(count);
	}
}
