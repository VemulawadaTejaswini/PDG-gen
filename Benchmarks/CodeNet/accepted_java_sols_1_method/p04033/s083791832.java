import java.util.*;

public class Main {
    	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long a,b;
		a = sc.nextLong();
		b = sc.nextLong();
		if(a<0 && b>0){
			System.out.println("Zero");
			return;
		}
		else if(a>0 && b>0){
			System.out.println("Positive");
			return;
		}
		
		if(((b-a)%2)==1) System.out.println("Positive");
		else System.out.println("Negative");

	}
}
