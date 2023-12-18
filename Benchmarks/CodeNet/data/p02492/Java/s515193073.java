mport java.util.Scanner;

public class Main{
	public static void main(String[] args){
		int i=1;
		while(i==1){
			Scanner s = new Scanner(System.in);
			int x=s.nextInt();
			String op =s.next();
			int y=s.nextInt();
			int ans=0;
			if(op.equals("+")){
				ans=x+y;
				System.out.println(ans);
			}
			else if(op.equals("-")){
				ans=x-y;
				System.out.println(ans);
			}

			else if(op.equals("*")){
				ans=x*y;
				System.out.println(ans);
			}
			else if(op.equals("/")){
				if(y!=0){
				ans=x/y;
				System.out.println(ans);
				}
			}
			else if(op.equals("?")){
				i=0;
			}
		}		
	}
}