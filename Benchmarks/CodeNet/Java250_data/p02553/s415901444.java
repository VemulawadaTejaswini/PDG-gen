import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long d = sc.nextLong();
		long max = a * c;
		long tmp = a * d;
		if (max < tmp)
			max = tmp;
		tmp = b * c;
		if (max < tmp)
			max = tmp;
		tmp = b * d;
		if (max < tmp)
			max = tmp;
		System.out.println(max);
		sc.close();
	}
}
