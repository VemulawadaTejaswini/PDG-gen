import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn= new Scanner(System.in);
		int n=scn.nextInt();
		int m=scn.nextInt();
		int[] arr =new int[n];
		long sum=0;
		for(int i=0;i<n;i++){
		   arr[i]=scn.nextInt();
		   sum+=arr[i];
		   }
		int count=0;
		double val =(sum*1.0)/(4*m);
		for(int i=0;i<n;i++){
			if((arr[i]*1.0)>=val){
				count++;
			}
		}
		if(count>=m){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}

}