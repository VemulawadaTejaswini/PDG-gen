import java.util.*;
public class Main {
	public static void main(String[] args){
      	
		Scanner sc = new Scanner(System.in);
		//String word_before = sc.next();
		//int K = sc.nextInt();
		
		int N = sc.nextInt();
		int arr[] = new int[N];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int sum_min =0;

		for (int i = arr[0]; i < arr[N-1]; i++) {
			int sum = 0;
			for (int j = 0; j < arr.length; j++) {
				sum += (i-arr[j])*(i-arr[j]);
			}
			if(sum_min ==0){
				sum_min = sum;
			}else if (sum<sum_min) {
				sum_min=sum;
			}

		}
		
		System.out.println(sum_min);
      	sc.close();
    }
		
		
}