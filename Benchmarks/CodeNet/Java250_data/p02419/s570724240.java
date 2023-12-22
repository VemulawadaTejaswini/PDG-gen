import java.util.Scanner;

public class Main{

	static final Scanner s=new Scanner(System.in);

	public static void main(String args[]){
		String a=s.next().toLowerCase(),b;
		int c=0;
		while(!(b=s.next()).equals("END_OF_TEXT"))
			if(a.equals(b.toLowerCase()))
				c++;
		System.out.println(c);
	}
}