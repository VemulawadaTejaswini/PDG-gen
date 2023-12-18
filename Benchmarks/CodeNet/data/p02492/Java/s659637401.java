import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String e;
		do{
			int a = sc.nextInt();		
			e = sc.next();
			int b = sc.nextInt();
			int ans;
			
			switch(e){
			case "+":
				ans = (int)(a + b);
				System.out.printf("%d\n",ans); 
				break;
			case "-":
				ans = (int)(a - b);
				System.out.printf("%d\n",ans);
				break;
			case "*":
				ans = (int)(a * b);
				System.out.printf("%d\n",ans);
				break;
			case "/":
				ans = (int)(a / b);
				System.out.printf("%d\n",ans);
				break;
			default:
				break;
			}
		}while(e != "?");
	}
}