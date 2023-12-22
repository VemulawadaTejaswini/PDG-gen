import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt()*1;
		int b = sc.nextInt()*5;
		int c = sc.nextInt()*10;
		int d = sc.nextInt()*50;
		int e = sc.nextInt()*100;
		int f = sc.nextInt()*500;
		if(a+b+c+d+e+f >= 1000)
			System.out.println(1);
		else
			System.out.println(0);
	}
}