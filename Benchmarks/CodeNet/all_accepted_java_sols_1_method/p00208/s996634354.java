import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			if(n==0) break;
			System.out.println(Integer.toOctalString(n).replace('7','9').replace('6','8').replace('5','7').replace('4','5'));
		}
	}
}