import java.util.Scanner;
class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		while(true){
			int n = scan.nextInt();
			if(n == 0){
				break;
			}
			int[] num = new int[n];
			for(int i=0;i<n;i++){
				num[i] = scan.nextInt();
			}
			
			int max=num[0];
			int sum;
			for(int i=0;i<n;i++){
				sum = num[i];
				for(int j=i+1;j<n;j++){
					sum += num[j];
					if(sum > max){
						max = sum;
					}
				}
			}
			
			System.out.println(max);
		}
	}
}