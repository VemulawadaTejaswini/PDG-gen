import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int a,b,c,d,e;
		
		if((a = sc.nextInt()) < 40)a = 40;
		if((b = sc.nextInt()) < 40)b = 40;
		if((c = sc.nextInt()) < 40)c = 40;
		if((d = sc.nextInt()) < 40)d = 40;
		if((e = sc.nextInt()) < 40)e = 40;
		
		System.out.println((a + b + c + d + e) / 5);
		
		sc.close();
	}
}