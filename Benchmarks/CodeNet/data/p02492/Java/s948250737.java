import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		char op = sc.next().charAt(0);
		int b = sc.nextInt();
		int ans=0;
		while(op != '?'){
			switch(op){
				case'+':
					ans=a+b;
					break;
				case'-':
					ans=a-b;
					break;
				case'/':
					ans=a/b;
					break;
				case'*':

					ans=a*b;
					break;
			}

		System.out.println(ans);
		a = sc.nextInt();
		op = sc.next().charAt(0);
		b = sc.nextInt();
		}
	}
	
}