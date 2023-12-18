import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int a = scan.nextInt();
			int b = scan.nextInt();
			if(a < b){
				int t = a;
				a = b;
				b = t;
			}
			int t = 0;
			while(true){
				t = a % b;
				if(t == 0){
					break;
				}
				a = b;
				b = t;
			}
			System.out.println(b);
		}
	}
}