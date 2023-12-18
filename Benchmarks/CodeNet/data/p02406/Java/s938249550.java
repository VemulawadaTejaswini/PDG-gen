import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner std = new Scanner(System.in);
		int n = Integer.parseInt(std.next());
		String ret = "";
		for (int i=3; i<=n; i++){
			if(i%3==0 || i%10==3){
				ret += " " + i;
			}
		}
		System.out.println(ret);
	}
}