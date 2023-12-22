import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0){
				break;
			}
			int[] array = new int[n];
			for(int i=0;i<n;i++){
				array[i] = sc.nextInt();
			}
			java.util.Arrays.sort(array);
			
			double average = 0;
			for(int i=1;i<n-1;i++){
				average += (double)array[i]/(n-2);
			}
			System.out.println((int)average);
		}
		
	}

}