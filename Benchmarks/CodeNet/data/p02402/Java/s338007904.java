import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int j = 0;
		int b = sc.nextInt();
		
		int min = b;
        int max = b;
        long sum = b;
        System.out.println("合計１"+sum);
		for(j=0;j<n-1;j++){
			int a = sc.nextInt();
			
			 sum =sum+a;
			 System.out.println("合計２"+sum);
		int i = 0;

		     min = Math.min(min,a);
		     max = Math.max(max,a);   	

		}
		System.out.println(min + " " +max+ " " +sum);
	}
	

}
