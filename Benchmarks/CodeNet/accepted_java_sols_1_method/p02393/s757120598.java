import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		int[] num = new int[3];
		int wk;
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<3;i++){
			num[i] = sc.nextInt();
		}
		for(int j=0;j<3-1;j++){
			for(int i=j+1;i<3;i++){
				if(num[j]>num[i]){
					wk = num[i];
					num[i] = num[j];
					num[j] = wk;
				}
			}
		}
		System.out.println(num[0] +" "+ num[1] +" "+ num[2]);
		sc.close();
	}

}