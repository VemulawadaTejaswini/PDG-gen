import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(true){
			int N = cin.nextInt();
			if(N==0)
				break;
			int[] sum = new int[N];
			int max=0, min=242344;
			for(int i = 0; i < N;i++){
				for(int j=0;j<5;j++){
					sum[i]+=cin.nextInt();
				}
				if(max<sum[i]){
					max=sum[i];
				}
				min = Math.min(min,sum[i]);
			}
			System.out.println(max + " " + min);
		}
	}

}