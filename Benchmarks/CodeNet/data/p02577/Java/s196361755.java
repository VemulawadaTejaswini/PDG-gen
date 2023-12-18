import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		
		String[] narray = n.split("");
		
		int sum = 0;
		for(String s:narray){
			sum += Integer.parseInt(s);
		}
		
		if(sum%9==0){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
		

	}
}