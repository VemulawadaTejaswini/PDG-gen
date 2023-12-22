

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int count = 0,sum = 0;
		float suuryou = 0;
		while(sc.hasNext()){
			String[] line =sc.next().split(",");
			int a = Integer.parseInt(line[0]);
			int b = Integer.parseInt(line[1]);
			sum += a*b;
			suuryou += b;
			count++;
		}
		float average = suuryou/count;
		int res = Math.round(average);
		System.out.println(sum);
		System.out.println(res);
	}

}