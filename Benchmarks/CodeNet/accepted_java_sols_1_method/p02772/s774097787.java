
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int f=0;
		for(int i=0;i<n;i++) {
			int a=sc.nextInt();
			if(a%2==0) {
				if(a%3!=0&&a%5!=0) {
					f=1;
				}
			}
		}
		if(f==0) {
			System.out.println("APPROVED");
		}else {
			System.out.println("DENIED");
			
		}

	}

}
