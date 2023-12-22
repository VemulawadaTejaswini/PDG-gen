import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.next());
		int[] a = new int[n];
		int wildCount = 0;
		for(int i=0;i<n;i++){
			a[i] = Integer.parseInt(scan.next());
			if(a[i]>=3200)wildCount++;
		}
		int min,sum = 0;
		for(int j=0;j<8;j++){//jは色
			if(check(a,j))sum ++;
		}
		//最小値
		if(sum==0){
			min = 1;
		}else{
			min = sum;
		}
		//最大値
		int max = sum;
		max += wildCount;


		System.out.println(min+" "+max);


	}

	static boolean check(int[] a,int b){
		for(int i=0;i<a.length;i++){
			if(400*b<=a[i] && a[i]<400*(b+1)){
				return true;
			}
		}
		return false;
	}
}
