import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int allday = in.nextInt();
		int pasta = in.nextInt();
		int sum = 0;
		int[][]A = new int [3][2];
		int[]B = new int [3];
		int[]C = new int [allday+1];
		for(int i = 1;i <= allday;i++)C[i] = 0;
		for(int i = 0;i < pasta;i++){
			int day = in.nextInt();
			C[day] = in.nextInt();
		}
		for(int i = 0;i < 3;i++)A[i][0]=1;
		switch(C[1] % 4){
		case 0:
			break;
		case 1:
			A[1][0] = 0;
			A[2][0] = 0;
			break;
		case 2:
			A[0][0] = 0;
			A[2][0] = 0;
			break;
		case 3:
			A[0][0] = 0;
			A[1][0] = 0;
			break;
		}
		for(int i = 2;i <= allday;i++){
			B[0]=A[1][0]+A[2][0]+A[1][1]+A[2][1];
			B[1]=A[0][0]+A[2][0]+A[0][1]+A[2][1];
			B[2]=A[0][0]+A[1][0]+A[0][1]+A[1][1];
			switch(C[i] % 4){
			case 0:
				for(int j = 0;j < 3;j++){
					A[j][1]=A[j][0] % 10000;
					A[j][0]=B[j] % 10000;
				}
				break;
			case 1:
				for(int j = 0;j < 3;j++){
					A[j][1]=A[j][0] % 10000;
					A[j][0]=B[j] % 10000;
					if(j != 0){
						A[j][0] = 0;
						A[j][1] = 0;
					}
				}
				break;
			case 2:
				for(int j = 0;j < 3;j++){
					A[j][1]=A[j][0] % 10000;
					A[j][0]=B[j] % 10000;
					if(j != 1){
						A[j][0] = 0;
						A[j][1] = 0;
					}
				}
				break;
			case 3:
				for(int j = 0;j < 3;j++){
					A[j][1]=A[j][0] % 10000;
					A[j][0]=B[j] % 10000;
					if(j != 2){
						A[j][0] = 0;
						A[j][1] = 0;
					}
				}
			}
		}
		for(int i = 0;i < 3;i++){
			sum = sum + A[i][0] + A[i][1];
		}
		sum = sum % 10000;
		System.out.println(sum);
	}
}