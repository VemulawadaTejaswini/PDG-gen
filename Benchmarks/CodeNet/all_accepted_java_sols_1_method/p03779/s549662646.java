import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		
		int sum;
		int t = 0;

		for(int i=1; i<=x; i++){
			sum = i * (i+1) / 2; 
			if(x<=sum){
				t = i;
				break;
			}
		}

		System.out.println(t);
		
	}

}
