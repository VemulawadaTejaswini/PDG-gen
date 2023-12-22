import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int D=sc.nextInt();

		int[][] points=new int [N][D];
		int count=0;

		for(int i=0;i<N;i++){
			for(int j=0;j<D;j++){
				points[i][j]=sc.nextInt();
			}
		}

		for(int i=0;i<N-1;i++){
			for(int j=i+1;j<N;j++){
			
				int sum=0;
				for(int k=0;k<D;k++){
					sum+=Math.pow(points[i][k]-points[j][k],2);
				}
				double distance=Math.sqrt(sum);
			
				double flooredDistance=Math.floor(distance);
				if(distance==flooredDistance){
					count++;
				}
			}
		}
		System.out.print(count);
	}
}