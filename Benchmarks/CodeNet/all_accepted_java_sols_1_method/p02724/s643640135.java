import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int k=x/500;
		int l=(x%500)/5;
		
		
		System.out.println(1000*k+5*l);
	}

}
