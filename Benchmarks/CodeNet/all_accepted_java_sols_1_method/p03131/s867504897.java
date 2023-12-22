import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long k = in.nextInt();
		long a = in.nextInt();
		long b = in.nextInt();
		if(1+k>=a && b-a>2) System.out.println((k-a+1)%2==0?(b-a)*(k-a+1)/2+a:(b-a)*((k-a+1)/2)+a+1);
		else System.out.println(k+1);
		in.close();
	}

}