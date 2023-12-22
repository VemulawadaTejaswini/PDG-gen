import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int k = s.nextInt();
		int t = s.nextInt();

		int[] arr = new int[t];
		int max = 0;
		int index = 0;
		for(int i=0;i<t;i++){
			arr[i] = s.nextInt();
			if(arr[i]>max){
				max = arr[i];
				index = i;
			}
		}
		int sum = 0;
		for(int i=0;i<t;i++){
			
			if(i!=index){
				sum += arr[i];
			}
		}

		if(max>sum){
			System.out.println(max-sum-1);
		}else{
			System.out.println(0);
		}

	}
}