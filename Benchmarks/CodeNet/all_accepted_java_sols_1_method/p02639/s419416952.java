import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		int[] N = new int[5];
		int result = 0;
		Scanner scan = new Scanner(System.in);
		for(int i =0;i<5;i++) {
			N[i]=scan.nextInt();
			if(N[i]==0) {
				result = i+1;
			}
		}		
		scan.close();
		System.out.println(result);
	}
}