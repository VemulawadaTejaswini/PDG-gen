import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] data = new int[n];
		int ramp = 1;
		int sum = 0;
		for(int i=0; i<n; i++){
			data[i] = sc.nextInt();
		}
		
		while(true){
			if(sum>n){
				System.out.println(-1);
				break;
			}else if(ramp == 2){
				System.out.println(sum);
				break;
			}
			ramp = data[ramp-1];
			sum++;
		}
	}
}