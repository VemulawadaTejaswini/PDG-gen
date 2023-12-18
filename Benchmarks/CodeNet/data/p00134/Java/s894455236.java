import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		//while(scan.hasNext()){
			int n = scan.nextInt();
			int s = 0;
			for(int i = 0;i < n;i++){
				s += scan.nextInt();
			}
			
			System.out.println((int)((double)s - 0.5) / n);
		//}
	}
}