import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),A=sc.nextInt(),B=sc.nextInt();
		if(Math.abs(n-A)<Math.abs(n-B))
			System.out.print('A');
		else if(Math.abs(n-A)>Math.abs(n-B))
			System.out.print('B');
	}
}
