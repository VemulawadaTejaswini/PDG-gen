import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		int profit_max=-1000000000;
		int min=1000000000;
		int tmp=0;
		for(int i=0; i<input; i++) {
			if(i!=0) {
				tmp=sc.nextInt();
				profit_max=Math.max(tmp-min, profit_max);
				if(min>tmp) {
					min=tmp;
				}
			}
			else {
				min=sc.nextInt();
			}
		}
		System.out.println(profit_max);
	}
}
