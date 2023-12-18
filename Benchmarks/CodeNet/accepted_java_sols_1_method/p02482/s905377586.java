import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int a,b;
		a=cin.nextInt();
		b=cin.nextInt();
		if(a<b){
			System.out.println("a < b");
		}else if(a>b){
			System.out.println("a > b");
		}else if(a==b){
			System.out.println("a == b");
		}
	}

}