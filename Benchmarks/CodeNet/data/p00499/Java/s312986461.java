import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		
		int k = A%C;
		int s = B%D;
		int large = 0;
		int x = 0;
		
		if(k == 0 && s == 0){
			if(A/C > B/D){
				large = A/C+1;
			}else{
				large = B/D;
			}
			x = L - large;
		}else if(k != 0 && s == 0){
			if(A/C+1 > B/D){
				large = A/C;
			}else{
				large = B/D;
			}
			x = L - large;
		}else if(k == 0 && s != 0){
			if(A/C > B/D+1){
				large = A/C;
			}else{
				large = B/D+1;
			}
			x = L - large;
		}else{
			if(A/C+1 > B/D+1){
				large = A/C+1;
			}else{
				large = B/D+1;
			}
			x = L - large;
		}
		System.out.println(x);
		// TODO Auto-generated method stub

	}

}