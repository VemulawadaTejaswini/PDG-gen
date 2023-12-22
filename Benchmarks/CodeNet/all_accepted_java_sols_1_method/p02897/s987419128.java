import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int odd = 0;
		int even = 0;
		for(int i=0;i<A;i++){
			if(i%2==1) odd++;
		}
		System.out.println(1-((float)odd/A));
	}
}