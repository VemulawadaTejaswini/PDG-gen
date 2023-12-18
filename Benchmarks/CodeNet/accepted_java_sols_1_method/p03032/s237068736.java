import java.util.Scanner;
import java.util.Arrays;

public class Main {
    static Scanner stdIn = new Scanner(System.in);
    public static void main(String[] args){
		int n = stdIn.nextInt();
		int k = stdIn.nextInt();
		int[] v = new int[n];
		for(int i=0; i<n; i++){
			v[i] = stdIn.nextInt();
		}

		int max = 0;
		Integer[] temp;
		for(int l=0; l<=50; l++){
			for(int r=0; r<=50; r++){
				if(l+r > n || l+r > k)
					continue;
				temp = new Integer[l+r];
				for(int i=0; i<l; i++){
					temp[i] = v[i];
				}
				for(int i=0; i<r; i++){
					temp[l+i] = v[n-i-1];
				}
				Arrays.sort(temp);
				int idx = 0;
				int times = 0;
				while(idx < temp.length-1 && temp[idx] < 0 && l+r+times<k){
					idx++;
					times++;
				}
				int sum = 0;
				for(int i=idx; i<temp.length; i++){
					sum += temp[i];
				}
				if(max < sum){
					max = sum;
				}
			}
		}

		System.out.println(max);
	}
}
