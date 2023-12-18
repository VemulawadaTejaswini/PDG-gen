import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = null;
		int n ,k;
		int[] set;
		try{
			scan =new Scanner(System.in);
			n = scan.nextInt();
			k = scan.nextInt();
			set = new int[n];
			for(int i = 0; i < set.length;i++)
				set[i] = scan.nextInt();
		}finally{
			if(scan!=null)scan.close();
		}
		int max ,sum = 0;
		for(int i = 0 ; i < k ; i ++){
			sum += set[i];
		}
		max = sum;
		for(int i = 0 ;i < n - k ; i++){
			sum +=(set[i+k] - set[i]);
			max = max < sum ? max:sum;
		}
		System.out.println(max);
	}
}