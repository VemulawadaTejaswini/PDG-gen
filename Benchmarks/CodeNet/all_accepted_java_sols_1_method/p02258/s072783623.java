import java.util.Scanner;

class Main
{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int[] r = new int[200000];
		int kai = -1000000000;
		
		int n = scan.nextInt();
		
		for(int i=0; i<n; i++){
			r[i] = scan.nextInt();
		}
		int min = r[0];
		int max = -1000000000;
		
		for(int j=1; j<n; j++){
			if(max < r[j]-min){
				max = r[j] - min;
			}
			if(min > r[j]){
				min = r[j];
			}
		}
		
		System.out.println(max);
	}
}
