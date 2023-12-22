import java.util.Arrays;
import java.util.Scanner;


public class Main{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			int n=scan.nextInt();
			int limit=scan.nextInt();
			int sum=0;
			int[] arr= new int[n];
			for(int i=0;i<n;i++){
				if(scan.nextInt()>=limit){
					sum++;
				}
			}
			System.out.println(sum);
		}
	}
}
