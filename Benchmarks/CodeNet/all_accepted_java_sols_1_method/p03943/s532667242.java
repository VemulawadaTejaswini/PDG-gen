import java.util.Scanner;
 
public class Main {
	
	public static void main(String[] args) throws Exception{	
		Scanner sc = new Scanner(System.in);

		int sum=0;
		int max=0;
		int t;
		for(int i=0; i<3; i++){
			t = sc.nextInt();
			sum += t;
			if(max < t) max = t;
		}
		
		
		if(sum == max*2) System.out.println("Yes");
		else System.out.println("No");
		
		sc.close();
	}
}