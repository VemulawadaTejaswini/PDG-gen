import java.util.Scanner;

public class Main {
	public static void main(String[] args){



		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int ans =1;
		if(n>=2000) {
			
		}else {
			for(int i=0;i<20;i++) {
				if(n>i*105&&(i+1)*100>n) {
					ans=0;
					break;
				}
			}
		}
		System.out.println(ans);
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
