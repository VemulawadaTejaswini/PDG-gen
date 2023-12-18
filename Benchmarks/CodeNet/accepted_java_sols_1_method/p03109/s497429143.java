import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int y = Integer.parseInt(s.substring(0,4));
		int m = Integer.parseInt(s.substring(5,7));
		int d = Integer.parseInt(s.substring(8,10));
		if(y<2019||(y==2019 && m<=4)) System.out.println("Heisei");
		else System.out.println("TBD");
		return;
	}
}