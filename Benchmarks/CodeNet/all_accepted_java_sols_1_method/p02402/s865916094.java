import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int max, min;
		long sum = 0;
		
		int n = in.nextInt();
		int[] ary = new int[n];
		for(int i=0; i<n; i++){
			ary[i] = in.nextInt();
		}
		
		//?????§?????¨????°????????¨????
		max = min = ary[0];
		for(int i=1; i<n; i++){
			if(max<ary[i]){
				max = ary[i];
			}
			if(min>ary[i]){
				min = ary[i];
			}
		}
		//????¨????????¨????
		for(int i=0; i<n; i++){
			sum += ary[i];
		}
		System.out.println(min+" "+max+" "+sum);
		in.close();
	}
}