import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc;
		int x;
		for(int i=1;;i++){
			sc=new Scanner(System.in);
			x=sc.nextInt();
			if(x==0) break;
			System.out.println("Case "+i+": "+x);
		}
	}
}