import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0,i,max=0,min=1000,ave;
		while(true){
		int n=sc.nextInt();
		if(n==0){
			break;
		}
		for(i=0;i<n;i++){
			int point=sc.nextInt();
			if(point<min){
				min=point;
			}
			if(point>max){
				max=point;
			}
			sum=sum+point;
		}
		ave=(sum-max-min)/(n-2);
		System.out.println(ave);
		}
	}
}