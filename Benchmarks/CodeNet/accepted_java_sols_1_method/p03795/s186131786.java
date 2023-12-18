import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int all = n*800;
		int x = n/15*200;
		System.out.println(all-x);
	}
}
