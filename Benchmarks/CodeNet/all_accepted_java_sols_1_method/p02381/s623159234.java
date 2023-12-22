import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int i, n;
		double s, sum, sum2;
		while(true){
			n = sc.nextInt();
			if(n==0) break;
			for(i=0, sum=0, sum2=0; i<n; i++){
				s = sc.nextDouble();
				sum += s;
				sum2 += s*s;
			}
			System.out.println(Math.sqrt(sum2/n-(sum/n)*(sum/n)));
		}
	}
}