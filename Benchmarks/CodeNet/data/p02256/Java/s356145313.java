import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int w;
		if(a<=b){
			w = a;
			a = b;
			b = w;
		}
		while(true){
			if((w=a%b)==0) break;
			a = b;
			b = w;
		}
		System.out.println(b);
	}

}