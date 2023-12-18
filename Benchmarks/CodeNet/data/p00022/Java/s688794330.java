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
			int sum=num[0];
			
			for(int i=1;i<n;i++){
				sum = Math.max(sum+num[i],num[i]);
				max = Math.max(sum,max);
			}
			
			System.out.println(max);
		}
	}
}