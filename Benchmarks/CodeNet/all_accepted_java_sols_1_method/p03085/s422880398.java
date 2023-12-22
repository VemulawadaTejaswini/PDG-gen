import java.util.*;
public class Main{
	public static void main(String[] args){
		int ans = 0;
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		
		if(n.equals("A")){
			System.out.println("T");
		}
		if(n.equals("T")){
			System.out.println("A");
		}
		if(n.equals("C")){
			System.out.println("G");
		}
		if(n.equals("G")){
			System.out.println("C");
		}
		
	}
}
