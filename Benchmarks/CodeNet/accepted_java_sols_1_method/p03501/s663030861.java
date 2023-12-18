import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		if(x*n<y){
			System.out.println(x*n);
		}
		else{
			System.out.println(y);
		}
	}
}