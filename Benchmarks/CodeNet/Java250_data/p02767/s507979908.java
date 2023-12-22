import java.util.*;
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] x = new int[n];
		

		for(int i=0;i<n;i++){
			x[i] = sc.nextInt();
		}

		int min = 100000000;
		for(int j=1;j<100;j++){
			int sum = 0;
			for(int t=0;t<n;t++){
				sum +=  (x[t] - j) * (x[t] - j);
				
			}
			if(sum < min){
				min = sum;
			}	
		 }

		 System.out.println(min);
		}
	}