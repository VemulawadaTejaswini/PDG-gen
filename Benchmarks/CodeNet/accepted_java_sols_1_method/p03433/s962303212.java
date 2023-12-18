import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int pay=sc.nextInt();
		int num=sc.nextInt();
		
		if(num>=pay%500) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}

}
