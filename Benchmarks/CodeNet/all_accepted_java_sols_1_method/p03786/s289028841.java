import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String args[]){
		Scanner cin = new Scanner(System.in);

		int target = cin.nextInt();
		long A[] = new long[target];
		int count =0;
		long tmp = 0L;
		long tmp_sum = 0L;
		boolean flg_brk = false;
		for(int i=0;i<target;i++){
			A[i] = cin.nextLong();
		}
		cin.close();
		Arrays.sort(A);

		for(int j=0;j<target-1;j++){
			tmp = A[j]+tmp_sum;
			if(2*tmp>=A[target-1]){
				count = target -j;
				break;
			}else if(j==0||A[j]!=A[j-1]){
				for(int k=j+1;k<target&&2*tmp>=A[k];k++){
					tmp += A[k];
					if(2*tmp>=A[target-1]){
						count = target-j;
						flg_brk = true;
					}
				}
				if(flg_brk){
					break;
				}
			}
			tmp_sum += A[j];
		}
		System.out.println(count);
	}
}