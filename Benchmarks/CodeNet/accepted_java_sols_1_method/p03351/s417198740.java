import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		System.out.println(((a-b)*(a-b)<=d*d && (b-c)*(b-c)<=d*d) || (a-c)*(a-c)<=d*d ? "Yes" : "No");
	}
}