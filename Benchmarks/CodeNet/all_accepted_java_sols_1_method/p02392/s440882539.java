import java.util.*;
class Main{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		String indata = s.next();
		int a = Integer.parseInt(indata);
		indata=s.next();
		int b = Integer.parseInt(indata);
		indata = s.next();
		int c = Integer.parseInt(indata);
		if(a<b&&b<c)System.out.println("Yes");
		else System.out.println("No");
	}
}