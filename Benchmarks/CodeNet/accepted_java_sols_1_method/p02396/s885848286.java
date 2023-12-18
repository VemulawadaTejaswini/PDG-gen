import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = 1;
		int x = 1;
		while(n != 0){
			n = sc.nextInt();
			if(n != 0){
				System.out.println("Case " + x + ": " + n);
				x += 1;
			}
		}
	}
}