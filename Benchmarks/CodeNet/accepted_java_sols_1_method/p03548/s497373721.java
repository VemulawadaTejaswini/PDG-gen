import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int X = Integer.parseInt(in.next());
		int Y = Integer.parseInt(in.next());
		int Z = Integer.parseInt(in.next());
		int ans = (X-Z) / (Y+Z);
		System.out.println(ans);
	}
}