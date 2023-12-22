	import java.util.Scanner;
	
	public class Main {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			
			for (;;){
			int a = sc.nextInt();
			String op = sc.next();
			int b = sc.nextInt();
			int ans=0;
			if(op.equals("+")){
				ans=a+b;
			}else if(op.equals("-")){
				ans=a-b;
			}else if(op.equals("*")){
				ans=a*b;
			}else if(op.equals("/")){
				ans=a/b;
			}else{
				break;
			}
			System.out.println(ans);
			}
		}
	}