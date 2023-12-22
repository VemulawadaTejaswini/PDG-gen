import java.util.*;
public class Main {
	public static void main(String[] args){
		//入力
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] A = new int[n];
		for(int i=0; i<n; i++){
			A[i] = sc.nextInt();
		}

		//
		int max=0;
		int temp=0;
		for(int i=0; i<n; i++){
			for(int j=i; j<n; j++){
				temp = A[i] - A[j];
				if(temp<0){
				temp = -temp;
				}
				if(max < temp){
				max=temp;
				}
			}
		}
		// 出力
		System.out.println(max);
	}
}