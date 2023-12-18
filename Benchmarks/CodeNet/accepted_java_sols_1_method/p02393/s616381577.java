import java.util.Scanner;

public class Main{
	static public void main (String args[]){
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("\\s");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if(a>b){
			if(b>c)
				System.out.println(c+" "+b+" "+a);
			else{
				if(a>c)
					System.out.println(b+" "+c+" "+a);
				else
					System.out.println(b+" "+a+" "+c);
			}
		} else {
			if(a>c)
				System.out.println(c+" "+a+" "+b);
			else{
				if(b>c)
					System.out.println(a+" "+c+" "+b);
				else
					System.out.println(a+" "+b+" "+c);
			}
		}
	}
}