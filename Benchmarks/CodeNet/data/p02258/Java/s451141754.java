import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int i,j,max = Integer.MIN_VALUE,n = sc.nextInt();
		int [] price = new int [n];

		for(i=0;i<n;i++){
			price[i] = sc.nextInt();
		}
		for(i=0;i<n-1;i++){
			for(j=i+1;j<n;j++){
				max = Math.max( max,(price[j]-price[i]) );
			}
		}
		System.out.println(max);
	}

}
