import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	Scanner sc;
	
	public void execution(int value, String op, int value2){
		if(op.equals("+")){
			System.out.println(value + value2);
		}
		else if(op.equals("-")){
			System.out.println(value - value2);
		}
		else if(op.equals("*")){
			System.out.println(value *value2);
		}
		else if(op.equals("/")){
			System.out.println(value / value2);
		}
	}
	public void run(){
		sc = new Scanner(System.in);
		
		while(true){
			int value = sc.nextInt();
			String op = sc.next();
			int value2 = sc.nextInt();
			if(!op.equals("?")){
				execution(value, op, value2);
			}
			else{
				break;
			}
		} 
	}
	public static void main(String[] args){
		new Main().run();
	}
}