import java.util.Scanner;
public class Main{
@SuppressWarnings("resource")
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int N=sc.nextInt();
	int N2=sc.nextInt();
	int N3=sc.nextInt();
	if(N+N2+N3>=22) {
		System.out.println("bust");
	}else {
		System.out.println("win");
	}
}
}