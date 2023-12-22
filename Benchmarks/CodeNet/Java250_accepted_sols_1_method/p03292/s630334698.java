import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a1 , a2 , a3 ;
		a1 = scan.nextInt();
		a2 = scan.nextInt();
		a3 = scan.nextInt();
		int diff1 = Math.abs(a1-a2);
		int diff2 = Math.abs(a2-a3);
		int diff3 = Math.abs(a3-a1);
		int sum1 = diff1+diff2;
		int sum2 = diff2+diff3;
		int sum3 = diff3+diff1;
		int min = sum1;
		if(sum2<min)
			min = sum2;
		if(sum3<min)
			min = sum3;
		System.out.println(min);
		scan.close();
	}

}
