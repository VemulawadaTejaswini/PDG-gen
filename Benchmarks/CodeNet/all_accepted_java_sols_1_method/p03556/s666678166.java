import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int N = Integer.parseInt(in.next());
		
		System.out.println((int)Math.pow(Math.floor(Math.sqrt(N)),2));
	}
}