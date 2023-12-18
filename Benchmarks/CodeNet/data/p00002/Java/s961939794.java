import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int a, b, c;
	public static void main(String[] args) {
		read();
		slove();
	}

	static boolean read(){
		a = sc.nextInt();
		b = sc.nextInt();
		return true;
	}
	
	static void slove(){
		c = a + b;
		if(c >= 0 && 10 > c){
			System.out.println("1");
		}else if(c >= 10 && 100 > c){
			System.out.println("2");
		}else if(c >= 100 && 1000> c){
			System.out.println("3");
		}else if(c >= 1000 && 10000 > c){
			System.out.println("4");
		}else if(c >= 10000 && 100000 > c){
			System.out.println("5");
		}else if(c >= 100000 && 1000000 > c){
			System.out.println("6");
		}else if(c >= 1000000 && 10000000 > c){
			System.out.println("7");
		}else if(c >= 10000000 && 100000000 > c){
			System.out.println("8");
		}else if(c >= 100000000 && 1000000000 > c){
			System.out.println("9");
		}else if(c >= 1000000000){
			System.out.println("10");
		}	
	
	}	
}