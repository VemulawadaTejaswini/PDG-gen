import java.util.Scanner;

public class Main{	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n;
		int max,min;
		int sum=0,ave;
		int[] point;
		while(true){
			n = sc.nextInt();
			if(n==0){
				break;
			}
			point = new int[n];
			for(int i=0;i<n;i++){
				point[i]=sc.nextInt();
			}
			max = point[0];
			min = point[0];
			for(int i=0;i<n;i++){
				if(max<point[i])
					max=point[i];
				if(min>point[i])
					min=point[i];
			}
			sum=0;
			for(int i=0;i<n;i++){
				sum+=point[i];
			}
			sum=sum-min-max;
			ave = sum/(n-2);
			System.out.println(ave);	
		}
		sc.close();
	}
}
