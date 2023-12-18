import java.util.Scanner;

public class Main{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		String s=sc.next();

		if(s.length()==3){
			char c[]=s.toCharArray();
			System.out.print(c[2]);
			System.out.print(c[1]);
			System.out.println(c[0]);

		}
		else System.out.println(s);


	}
}