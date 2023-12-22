import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int y=Integer.parseInt(s.substring(0,4));
		int m=Integer.parseInt(s.substring(5,7));
		int d=Integer.parseInt(s.substring(8,10));
		
		if(y==2019&&4<m) {System.out.println("TBD");}
		if(y==2019&&m<=4) {System.out.println("Heisei");}
		if(y<2019) {System.out.println("Heisei");}
		if(2019<y) {System.out.println("TBD");}	
	}
}