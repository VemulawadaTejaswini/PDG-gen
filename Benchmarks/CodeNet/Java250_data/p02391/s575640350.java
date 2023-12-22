import java.util.*;
class Main{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		String indata = s.next();
		int a = Integer.parseInt(indata);
		indata=s.next();
		int b = Integer.parseInt(indata);
		if(a==b)System.out.println("a == b");
		else if(a>b)System.out.println("a > b");
		else System.out.println("a < b");
	}
}