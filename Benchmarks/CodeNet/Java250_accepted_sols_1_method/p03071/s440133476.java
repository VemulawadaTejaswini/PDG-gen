import java.util.Scanner;

public class Main{

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		int a = Integer.parseInt(scanner.next());
		int b = Integer.parseInt(scanner.next());
		scanner.close();

		int res = 0;

		if(a < b){
			res += b;
			b--;
		}else{
			res+= a;
			a--;
		}

		if(a < b){
			res += b;
		}else{
			res += a;
		}

		System.out.println(res);
	}
}
