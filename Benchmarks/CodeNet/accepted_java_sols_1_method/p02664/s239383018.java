import java.util.Scanner;
public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String T2=sc.next();
		String T[]=T2.split("");

		for(int i=0;i<T.length;i++) {
			if(T[i].equals("?")) {
				System.out.print("D");
				continue;
			}
			System.out.print(T[i]);
		}


	}
}
