import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=1;
		while(true){
			int x=sc.nextInt();
			if(x==0) break;
			System.out.println("Case "+a+": "+x);
			a++;
		}
	}
}
