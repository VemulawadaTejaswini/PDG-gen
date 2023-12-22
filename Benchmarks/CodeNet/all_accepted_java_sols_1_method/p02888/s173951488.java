import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String args[]){//double 处理果盘
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		long[] num = new long[(int) n];
		for (int i=0;i<n;i++){
			num[i] = in.nextLong();
		}
		Arrays.sort(num);
//		System.out.println(num.length);
		int count = 0;
		for (int i=0;i<n-2;i++){
			for (int j=i+1;j<n-1;j++){
				long su = num[i]+num[j];
				for(int k=j+1;k<n;k++){
					if (num[k] < su){
						++count;
					}else{
						break;
					}
				}
			}
		}
		System.out.println(count);
	}
}	