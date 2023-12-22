import java.util.Scanner;

public class Main {
	public static void main(String[] args){



		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		String s = sc.next();
		String[] ss = s.split("");
		int[] num = new int[n];
		for(int i =0;i<n;i++) {
			num[i] = Integer.parseInt(ss[i]);
		}
		int counter = 0;
		for(int i =0;i<1000;i++) {
			int[] digits = new int[3];
			digits[0] = i%10;
			digits[1] = (i/10)%10;
			digits[2] = i/100;
			int digitref = 2;
			
			int target = 0;
			while(target<n&&digitref>-1) {
				if(num[target]==digits[digitref]) {
					digitref--;
				}
				target++;
			}
			if(digitref<0)counter++;
		}
		System.out.println(counter);
	}
}
/*
class City{
	int order;
	int prefecture;
	int year;
	int number;
	City(int order,int prefecture, int year){
		this.order = order;
		this.prefecture = prefecture;
		this.year = year;
	}
}
*/
