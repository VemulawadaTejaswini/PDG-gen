import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a=0,b=0,c=0;
		for(int i = 0;i < n;i++){
		 	a = scan.nextInt();
		 	a = a * a;
		 	b = scan.nextInt();
		 	b = b * b;
		 	c = scan.nextInt();
		 	c = c * c;
		 	if((a + b == c) || (a + c == b) || (b + c == a)){
		 		System.out.println("YES");
		 	}else{
		 		System.out.println("NO");
		 	}
		}
	}
}