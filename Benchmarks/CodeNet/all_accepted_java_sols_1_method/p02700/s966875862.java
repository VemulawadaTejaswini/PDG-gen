import java.util.*;
public class Main {
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		int a = Integer.parseInt(scan.next());
		int b = Integer.parseInt(scan.next());
		int c = Integer.parseInt(scan.next());
		int d = Integer.parseInt(scan.next());

		while(true){
			c -=b;
			if(c <= 0){
				System.out.println("Yes");
				break;
			}

			a -=d;
			if(a <= 0){
				System.out.print("No");
				break;
			}
		}

	}

}
//end