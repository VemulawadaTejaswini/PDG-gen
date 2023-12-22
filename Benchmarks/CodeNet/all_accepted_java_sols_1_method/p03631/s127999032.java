import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String n = in.next();
		for(int i=0,j=2;i<j;i++,j--){
			if(n.charAt(i)!=n.charAt(j)){
				System.out.println("No");
				System.exit(0);
			}
		}
		System.out.println("Yes");
		in.close();
	}
}
