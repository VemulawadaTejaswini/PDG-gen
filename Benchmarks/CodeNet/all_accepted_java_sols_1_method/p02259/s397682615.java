import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] list = new int[n];
		int tmp = 0;
		boolean flag = true;
		int count = 0;
		for(int i = 0;i<n;i++){
			list[i] = sc.nextInt();
		}
		while(flag){
			flag = false;
			for(int j = n-1;j>0;j--){
				if(list[j] < list[j-1]){
					tmp = list[j];
					list[j] = list[j-1];
					list[j-1] = tmp;
					flag = true;
					count += 1;
				}
			}
			
		}
		for(int i = 0;i < n;i++){
			System.out.print(list[i]);
			if(i != (n-1)){
				System.out.print(" ");
			}else{
				System.out.println();
			}
		}
		System.out.println(count);
	
	}
}
