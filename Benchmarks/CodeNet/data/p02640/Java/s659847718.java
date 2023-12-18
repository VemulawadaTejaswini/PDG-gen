import java.util.*;
import java.math.*;
public class Main {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		
		if (Y%2!=0)
		{System.out.println("NO");}
	else if ((Y>4*X)||(Y<2*X))
		{System.out.println("NO");}
	else{System.out.println("YES");}

	
	}
}