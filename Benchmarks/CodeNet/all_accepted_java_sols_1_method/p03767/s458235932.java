import java.util.Arrays;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[3*N];
		for(int i=0; i<3*N; i++){
			a[i]  = sc.nextInt();
		}
		
		Arrays.sort(a);
		
		long sum = 0;
		int min = 0;
		int max = 3*N-1;
		int set_num = 0;
		while(min!=max){
			if(set_num==0){
				max -= 1;
				set_num = 1;
			}else if(set_num==1){
				sum += a[max];
				max -= 1;
				set_num = 2;
			}else if(set_num==2){
				min += 1;
				set_num = 0;
			}
		}
		
		System.out.println(sum);

	}

}
