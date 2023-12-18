import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int x = 0;
		int y = 0;
		int anc = 99999999;
		for(int i = 1;i <= a-1;i++){
			x = i / 100000 + ((i % 100000) / 10000) + ((i % 10000) / 1000) + ((i % 1000) / 100) + ((i % 100) / 10) + (i % 10);
			y = a - i;
			x = x + y / 100000 + ((y % 100000) / 10000) + ((y % 10000) / 1000) + ((y % 1000) / 100) + ((y % 100) / 10) + (y % 10);
			if(x < anc) anc = x;
		}
		System.out.println(anc);
	}
}