import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		 int n = scan.nextInt();
		 int x = scan.nextInt();
		 int t = scan.nextInt();

		 if(n%x != 0){
			System.out.print(n/x*t+t);
		 }else{
			System.out.print(n/x*t);
		 }

	}
}
