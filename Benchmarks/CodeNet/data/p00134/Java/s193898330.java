import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int number = 0;
	static int value  = 0;
	static int average = 0;
	
	public static void main(String[] args) {
		read_number();
		int i = 0;
		
		while(i < number){
			read_value();
			i++;
		}
		slove();
		
	}
	static boolean read_number(){
		number = sc.nextInt();
		return true;
	}
	static boolean read_value(){
		value = value + sc.nextInt();
		return true;
	}
	static void slove(){
		System.out.println((int)Math.floor(value/number));
	}
}