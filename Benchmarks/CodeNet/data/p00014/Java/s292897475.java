import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext())calc(in);
	}
	private static void calc(Scanner in){
		int sum=0,d = in.nextInt();
		for(int i=1;d*i<=600-d;i++)
			sum+=Math.pow(d*i, 2)*d;
		System.out.println(sum);
	}
}