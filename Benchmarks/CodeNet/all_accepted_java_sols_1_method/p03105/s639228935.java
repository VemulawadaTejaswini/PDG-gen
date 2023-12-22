import java.util.*;

public class Main{
	static public void  main(String[] args){
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();

		if (a * c <= b){
			System.out.println(c);
		}else{
			System.out.println(b / a);
		}
	}
}
