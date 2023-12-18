import java.util.Scanner;
public class Main {
@SuppressWarnings("resource")
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int X=sc.nextInt();
	int Y=sc.nextInt();
	if(X+Y==3) {
		System.out.println(3);
	}else if(X+Y==4) {
		System.out.println(2);
	}else if(X+Y==5) {
		System.out.println(1);
	}
}
}