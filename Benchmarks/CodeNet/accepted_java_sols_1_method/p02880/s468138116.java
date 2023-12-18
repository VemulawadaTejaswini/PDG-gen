import java.util.Scanner;
public class Main {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int a;
		while(sc.hasNextInt()) {
			a=sc.nextInt();
		for(int i=9;i>0;i--) {
			if(a%i==0) { 
				a=a/i;
			if(a>=1&&a<10) {
				System.out.println("Yes");
				break;
			}else {
			System.out.println("No");
			break;
			}
			}
		}
		}
		}
	}
