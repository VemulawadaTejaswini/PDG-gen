import java.util.Scanner;

public class Main {

	static long bignum = 1000000000+7;

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		String[] ss = s.split("");
		boolean check = false;
		for(int i =0;i<3;i++) {
			if(ss[i].equals("7"))check=true;
		}
		if(check) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
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
