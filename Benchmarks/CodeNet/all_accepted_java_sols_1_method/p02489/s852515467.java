import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int i=0;
		while(i>=0){
			int n = sc.nextInt();
			if(n == 0){
				break;
			}
			else{
				i++;
				System.out.printf("Case %d: %d\n", i, n);
			}
	}
	}
}