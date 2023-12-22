import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		long N = sc.nextLong();
		//交通機関の収納数配列
		long[] kikan = new long[5];
		long min= (long)Math.pow(10, 15);
		for(int i = 0; i<5;i++) {
			kikan[i] = sc.nextLong();
			min = Math.min(min, kikan[i]);
		}
//		double a = Math.ceil((double)N/(double)min);
		long anser = (long)Math.ceil((double)N/(double)min)+4;
		System.out.println(anser);
		}
	}
