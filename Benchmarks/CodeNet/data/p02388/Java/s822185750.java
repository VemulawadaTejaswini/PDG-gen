import java.util.Scanner;
public class Main{	
	public static void main(String[] args) {
		int result = 0;
		Scanner input = new Scanner(System.in);
		int x=input.nextInt();		
		if(x >=1 && x<=100){
		result = x*x*x;
		System.out.print(result);
	}
	}		
}