import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		System.out.print("a ");
		
		if(x>y){
			System.out.print(">");
		} else if(x<y){
			System.out.print("<");
		} else if(x==y){
			System.out.print("==");
		}
		
		System.out.println(" b");
	}
}