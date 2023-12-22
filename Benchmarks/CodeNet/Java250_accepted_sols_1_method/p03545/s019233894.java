import java.util.Scanner;

class Main {

	public static void main(String args[]){

		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int n = 4;
		int x[] = new int[n];
		for(int i = 0;i < n; i++)
			x[i] = s.charAt(i)-'0';

		String X[] = new String[(int) Math.pow(2,n-1)];
		int sum = 0;
		String S ="";

		for(int i = 0; i < Math.pow(2,n-1); i++){
			sum = x[0];
			S = String.valueOf(x[0]);
			for(int j = 0; j < n-1; j++){

				if((1 & (i>>j)) == 1){
					sum += x[j+1];
					S += "+" + String.valueOf(x[j+1]);
				}
				else{
					sum -= x[j+1];
					S += "-" + String.valueOf(x[j+1]);
				}
			}
			if(sum == 7){
				System.out.print(S+"=7");
				break;
			}
		}
	}
}
