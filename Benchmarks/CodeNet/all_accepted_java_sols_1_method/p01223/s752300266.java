import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		for(int T=cin.nextInt();T--!=0;){
			int n=cin.nextInt();
			int[] a=new int[n];
			for(int i=0;i<n;i++){
				a[i]=cin.nextInt();
			}
			int max=0;
			int min=0;
			for(int i=0;i<n-1;i++){
				max=Math.max(max,a[i+1]-a[i]);
				min=Math.min(min,a[i+1]-a[i]);
			}
			
			System.out.println(max+" "+(-min));
		}
	}

}