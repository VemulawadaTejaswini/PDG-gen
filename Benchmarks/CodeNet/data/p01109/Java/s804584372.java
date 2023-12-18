import java.util.*;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int a[] = new int[100000];

		while(n > 0){
			int sum = 0;
			
			for(int i=0; i<n; ++i){
				a[i] = sc.nextInt();
				sum += a[i];
			}
			
			double average = (double)sum / n;
			
			int answer = 0;
			for(int i=0; i<n; ++i){
				if( a[i] <= average ){
					answer++;
				}
			}
			
			System.out.println(answer);
			
			n = sc.nextInt();
		}
		
	}
}

