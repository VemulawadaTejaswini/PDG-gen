import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		//while(scan.hasNext()){
			int n = scan.nextInt();
			long s = 0;
			for(int i = 0;i < n;i++){
				s += scan.nextInt();
			}
			
			System.out.println(s / n);
		//}
	}
}