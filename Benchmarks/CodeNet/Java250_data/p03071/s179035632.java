import java.util.Scanner;
public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int total = 0;
		if(a>b) {
			total+=2*a-1;
		}else if(a==b) {
			total+=2*a;
		}else {
			total+=2*b-1;
		}
		System.out.println(total);

	}
	}
