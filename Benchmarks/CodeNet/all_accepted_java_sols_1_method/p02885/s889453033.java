import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt() * 2;
		
		if (a <= b ){
			System.out.print(0);
		}else{
			System.out.print(a-b);
		}
		
	}
}