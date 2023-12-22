import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long a = sc.nextLong();
		long b = sc.nextLong();
		long count = n/(a+b);
		long rest = n%(a+b);
		long blue = 0;
		if(rest < a){
			blue = (a * count) + rest;
		}else {
			blue = a * (count + 1);
		}
		System.out.println(blue);
	}
}