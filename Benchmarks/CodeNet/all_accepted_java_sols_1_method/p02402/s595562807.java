import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int kaisu = scan.nextInt();
		long[] num= new long[kaisu];
		long max = -1000001;
		long min = 1000001;
		long sum = 0; 

		for(int i = 0; i < kaisu ; i++){
			num[i] = scan.nextLong();
			if(max < num[i]) max = num[i];
			if(min > num[i]) min = num[i];
			sum = sum + num[i];
		}
		System.out.println(min + " " + max + " " + sum);
	}
}