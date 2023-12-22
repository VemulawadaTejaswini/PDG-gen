import java.util.Scanner;

public class Main{

	static Scanner s=new Scanner(System.in);

	public static void main(String __[]){
		input();
		solve();
	}

	private static void input(){
	}

	private static void solve(){
		char c[] = s.nextLine().toCharArray();
		for(int i=0;i<c.length;i++)
			c[i]=c[i]<='Z'
			?Character.toLowerCase(c[i])
			:Character.toUpperCase(c[i]);
		System.out.println(String.valueOf(c));
	}
}