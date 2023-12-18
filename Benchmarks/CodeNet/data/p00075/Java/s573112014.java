import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] studentNum = new int[5];
		float[] weight = new float[5];
		float[] tall = new float[5];
		float[] bmi = new float[5];
		int sum = 0;
		
		for(int i = 0; i < 5; i++){
			studentNum[i] = sc.nextInt();
			weight[i] = sc.nextFloat();
			tall[i] = sc.nextFloat();
			bmi[i] = (float) (weight[i] / Math.pow(tall[i], 2));
			if(bmi[i] > 24) sum++;
		}
		System.out.println(sum);
	}
}