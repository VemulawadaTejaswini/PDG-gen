import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] list = new int[n];
		int tmp = 0;
		int j;
		for(int i = 0;i<n;i++){
			list[i] = sc.nextInt();
		}
		for(int i = 0;i<n;i++){
			tmp = list[i];
			j = i - 1;
			while(j >= 0 && list[j] > tmp){
				list[j+1] = list[j];
				j--;
				list[j+1] = tmp;
			}
			System.out.print(list[0]);
			for(int k = 1;k<n;k++){
				System.out.print(" " + list[k]);
			}
			System.out.println();
		}
	
	}
}

