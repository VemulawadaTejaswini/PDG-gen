import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int a,b,c;
		Scanner scanner1=new Scanner(System.in);
		Scanner scanner2=new Scanner(System.in);
		Scanner scanner3=new Scanner(System.in);
		a=scanner1.nextInt();
		b=scanner2.nextInt();
		c=scanner3.nextInt();
	
	    if(a<b&&b<c) {
	    System.out.println("Yes");
	}else {
		System.out.println("No");
	}

}
}

