import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 * <br>ÛèCÌvO
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int max=0,sum=0,
			n,k;
		int[] list;
		while(true){
			n = scan.nextInt();		//¢
			k = scan.nextInt();
			if(n==0 && k==0){
				break;
			}
			
			list = new int[n];
			for(int i=0; i<n; i++){
				list[i] = scan.nextInt();
				if(k==i+1){			//ñÌZbg
					max = 0;
					sum = 0;
					for(int j=0; j<k; j++){
						sum += list[j];
					}
				}else if(k<=i){
					sum += list[i];
					sum -= list[i-k];
				}
				
				if(max<sum){
					max = sum;
				}
			}
			
			System.out.println(max);
		}
	}
}