import java.util.*;

class Main{
	public static void main(String[] args){
		int a;
		int b;
		
		Scanner cin = new Scanner(System.in);
		a=cin.nextInt();
		b=cin.nextInt();
		
		if(a>b){
			System.out.println("a > b");
		}else if(a<b){
			System.out.println("a < b");
		}else{
			System.out.println("a = b");
		}
	}
}
