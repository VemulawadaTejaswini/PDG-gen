import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			int k = scan.nextInt();
			int x = 0;
			int y = 0;
			int t = 0;
			for(int i = 0;i < k;i++){
				x = scan.nextInt();
				y = scan.nextInt();
				x = (x > n/2)?n+1-x:x;
				y = (y > n/2)?n+1-y:y;
				t = (x < y)?x%3:y%3;
				System.out.println((t==0)?3:t);
			}
		}
	}
}