import java.util.Scanner;
public class Main{
	public static void main(String[]args){
	for (int i = 0 ;; i++) {

	Scanner sc= new Scanner(System.in);
	int a=sc.nextInt();
	String o=sc.next();
	int b=sc.nextInt();
		if (o.equals("?")){
			break;
		}else if(o.equals("+")){
			System.out.println(a+b);

		}else if(o.equals("-")){
			System.out.println(a-b);

		}else if(o.equals("*")){
			System.out.println(a*b);

		}else if(o.equals("/")){
			System.out.println(a/b);
		}
}
}
}