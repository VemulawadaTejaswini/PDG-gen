import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		while(true){
			int n=sc.nextInt();
			if(n==0){
				break;
			}
			int[]scores =new int[n];
			for(int i=0;i<scores.length;i++){
				scores[i]=sc.nextInt();
			}
			double average =0,variance=0;
			for(int i=0;i<n;i++){
				average=average+scores[i];
			}
			average=average/n*1.0;
			for(int j=0;j<n;j++){
				variance=variance+(scores[j]-average)*(scores[j]-average);
			}
			variance=variance/n*1.0;
			System.out.println(Math.sqrt(variance));
		}
	}
}