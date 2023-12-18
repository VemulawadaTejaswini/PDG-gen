import java.util.Scanner;

public class Main {
	public static void main(String[] args){



		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		String s = sc.next();	
		for(int i =0;i<s.length();i++) {
			char c = s.charAt(i);
			int limit = (int)'Z'-(int)'A';
			int target = (int)c + n;
			if(target>(int)'Z') {
				target = target-limit-1;
			}
			System.out.print((char)target);
		}
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
