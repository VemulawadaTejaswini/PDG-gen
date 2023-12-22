import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(true){
			int n = scan.nextInt();
			int k = scan.nextInt();
			if(n == 0 && k == 0){
				break;
			}
			int[] d = new int[n];
			for(int i = 0;i < n;i++){
				d[i] = scan.nextInt();
			}
			int sum = 0;
			int max = 0;
			for(int i = 0;i < n-k+1;i++){
				sum = 0;
				for(int j = i;j < i+k;j++){
					sum += d[j];
				}
				if(max < sum){
					max = sum;
				}
			}
			System.out.println(max);
		}
	}
}