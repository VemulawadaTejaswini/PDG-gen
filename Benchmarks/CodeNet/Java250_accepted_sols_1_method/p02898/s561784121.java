import java.util.Scanner;
public class Main {
	public static void main(String args[]){//double 处理果盘
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(),num=0;
		int k = in.nextInt();
		int[] h = new int[n];
		for(int i=0;i<n;i++){
			h[i] = in.nextInt();
		}
		for (int i=0;i<n;i++){
			if(h[i]>=k){
				++num;
			}
		}
		System.out.println(num);
	}
}	
		