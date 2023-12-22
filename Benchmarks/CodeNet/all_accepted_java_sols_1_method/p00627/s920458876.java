import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			if(n == 0){
				break;
			}
			n /= 4;
			int count = 0;
			for(int i = 0;i < n;i++){
				count += scan.nextInt();
			}
			System.out.println(count);
		}
	}
}