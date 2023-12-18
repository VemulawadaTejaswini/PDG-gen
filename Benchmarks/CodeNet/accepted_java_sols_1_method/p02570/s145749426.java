import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int d = scan.nextInt();
		int t = scan.nextInt();
		int s = scan.nextInt();

		if((double)d/s > t){
			System.out.print("No");
		}else{
			System.out.print("Yes");
		}
	}
}
