import java.util.*;

class Main{
	public static void main(String[] $){
		System.err.println();
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		String t=s.next();

		if(n%2==0&&t.substring(0,n/2).equals(t.substring(n/2))) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
