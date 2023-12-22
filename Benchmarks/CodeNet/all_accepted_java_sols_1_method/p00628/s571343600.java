import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			while(sc.hasNext()) {
				String str=sc.nextLine();
				if(str.equals("END OF INPUT")) {
					break;
				}
				String[] t=str.split(" ");
				for(int i=0; i<t.length; i++) {
					System.out.print(t[i].length());
				}
				System.out.println();
			}
		}
	}
}
