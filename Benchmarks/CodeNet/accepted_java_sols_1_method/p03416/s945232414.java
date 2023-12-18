import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A =sc.nextInt();
		int B =sc.nextInt();
		int N =0;
		int ans =0;
			
		for(int i=1; i<=9; i++){
			for(int j=0; j<=9; j++){
				for(int k=0; k<=9; k++){
					N = i*10001+j*1010+k*100;
					if(A<=N && N<=B){
						ans++;
					}
				}
			}
		}
			System.out.println(ans);
	}
}