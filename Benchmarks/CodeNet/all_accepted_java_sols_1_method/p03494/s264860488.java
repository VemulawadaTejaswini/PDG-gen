import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int answer = 0;
		int count = sc.nextInt();
		boolean endFlg = false;

		long[] nubmerList = new long[count];
		for(int i = 0; i < count; i++) {
			nubmerList[i] = sc.nextLong();
		}
		while(true) {
			for(int i = 0; i < count; i++) {
				if(nubmerList[i] % 2 == 1) {
					endFlg = true;
					break;
				}else {
					nubmerList[i] = nubmerList[i]/2;
				}
			}
			if(!endFlg) {
				answer++;
			}else {
				break;
			}
		}

		System.out.println(answer);
	}
}