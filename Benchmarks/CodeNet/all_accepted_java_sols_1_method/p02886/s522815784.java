import java.util.Scanner;
public class Main {
	public static void main(String args[]){//double 处理果盘
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] num = new int[n];
		long sum = 0;
		for (int i=0;i<n;i++){
			num[i] = in.nextInt();
		}
		
		for (int i=0;i<n;i++){
			for (int j=i+1;j<n;j++){
				sum += num[i]*num[j];
			}
		}
		System.out.println(sum);
	}
}