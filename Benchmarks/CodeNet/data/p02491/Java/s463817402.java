import java.util.*;

public class Main {
	static Scanner s = new Scanner(System.in);
	public static void main(String args[]){
		while(true){
			int a = s.nextInt();
			int b = s.nextInt();
			System.out.println(a/b+" "+a%b+" "+(double)a/b);
		}
	}
}