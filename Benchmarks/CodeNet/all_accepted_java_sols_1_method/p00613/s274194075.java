import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			if(n == 0){
				break;
			}
			int sum = 0;
			for(int i = 0;i < n*(n-1)/2;i++){
				sum += scan.nextInt();
			}
			System.out.println(sum/(n-1));
		}
	}
}