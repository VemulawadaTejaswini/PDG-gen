import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean a = true, b = false, c = false, tmp;
		String[] strings;

		while(sc.hasNext()){
			strings = sc.next().split(",");

			if(strings[0].equals("A") && strings[1].equals("B")){
				tmp = a;
				a = b;
				b = tmp;
			}else if(strings[0].equals("B") && strings[1].equals("C")){
				tmp = b;
				b = c;
				c = tmp;
			}else{
				tmp = c;
				c = a;
				a = tmp;
			}
		}

		if(a == true) System.out.println("A");
		else if(b == true) System.out.println("B");
		else System.out.println("C");
	}
}