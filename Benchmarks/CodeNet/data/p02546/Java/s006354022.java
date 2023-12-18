import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int ans=0;
		Scanner sc = new Scanner(System.in);
		String hako = sc.nextLine();
		char[] c = hako.toCharArray();
		if(c[c.length-1] == 's') {
			for(int i=0;i<c.length-1;i++) {
				System.out.print(c[i]);
			}
			System.out.print("es");
		}
		else {
			System.out.println(hako + "s");
		}
			
	}
}
