import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		for(int i = 0;i <= x; ++i){
			if(i*2 + (x-i)*4 == y){
				System.out.print("Yes");
				return;
			}
		}
		System.out.print("No");
	}
}
