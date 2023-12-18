import java.util.Scanner;
public class Main {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int c=0;
		while(true) {
			int a=sc.nextInt();
			if(a==0) {
				break;
			}
			c+=1;
			System.out.println("Case "+c+": "+a);
		}
	}
}

