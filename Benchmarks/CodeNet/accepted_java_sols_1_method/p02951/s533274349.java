import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		int cap1 = A-B;
		
		int use = 0;
		
		if(cap1<C){
			use = cap1;
		}else{
			use = C;
		}
		
		System.out.println(C-use);
	}

}