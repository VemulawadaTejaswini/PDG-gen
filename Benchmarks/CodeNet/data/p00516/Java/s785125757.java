import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); //??¶?????°
		int m = sc.nextInt(); //?§?????????°
		int i;
		int max=0;
		int mmax=0;
		int kyoginm=0;
		int result=0;

		int[] kyogi = new int[n];
		int[] hu = new int[m];
		int[] score = new int[n];

		for(i = 0; i < n; i++){
			kyogi[i] = sc.nextInt();
			score[i] = 0;//?????¨
		}

		for(i = 0; i < m; i++){
			hu[i] = sc.nextInt(); //??????
		}


		for(i = 0; i < m; i++){
			for(int j = 0; j < n; j++){
				if(hu[i] >= kyogi[j]){
					score[j] = score[j]+1;
					break;
				}
			}
		}

		for(i = 0; i < n; i++){
			if(max < score[i]){
				max = score[i];
				result = i+1;
			}
		}

		System.out.print(result);

	}
}