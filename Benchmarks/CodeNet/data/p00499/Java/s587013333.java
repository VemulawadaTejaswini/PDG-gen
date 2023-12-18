import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int wDay = scan.nextInt();
			int j = scan.nextInt();
			int m = scan.nextInt();
			int c = scan.nextInt();
			int d = scan.nextInt();
			int t = 0;
			if(j % c != 0){
				t = 1;
			}
			j /= c;
			j += t;
			t = 0;
			if(m % d != 0){
				t = 1;
			}
			m /= d;
			m += t;
			if(j > m){
				System.out.println(wDay-j);
			}else{
				System.out.println(wDay-m);
			}
		}
	}
}