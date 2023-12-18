import java.util.Scanner;

public class Main{

	public static void main(String[] args){
		Scanner s = new Scanner(System.in);

		int max=0;
		int min=100000;
		int sum=0;
		int ave;
		int[] scr= new int[100];
		while(true){
			int n=s.nextInt();
			if(n==0){
				break;
			}
			for(int i=0;i<n;i++){
				scr[i]=s.nextInt();
				if(scr[i]>max){
					max=scr[i];
				}
				if(scr[i]<min){
					min=scr[i];
				}
				sum+=scr[i];
			}
			sum-=(max+min);
			ave=sum/(n-2);
			System.out.println(ave);
			max=0;
			min=100000;
			sum=0;
		}
	}
}