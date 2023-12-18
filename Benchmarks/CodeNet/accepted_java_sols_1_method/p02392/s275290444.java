import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		String ans;
		if(a<b && b<c) {
			ans="Yes";
		}else {
			ans="No";
		}
		
		System.out.printf("%s%n",ans);
	}

}

