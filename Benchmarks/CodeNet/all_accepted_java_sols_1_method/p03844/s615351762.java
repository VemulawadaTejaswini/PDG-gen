import java.util.Scanner;

public class Main{
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	int A = scan.nextInt();
	String op = scan.next();
	int B = scan.nextInt();
	
	int res;
	if(op.equals("+")){
		res = A+B;
	}else{
		res = A-B;
	}
	
	System.out.println(res);
	}
}