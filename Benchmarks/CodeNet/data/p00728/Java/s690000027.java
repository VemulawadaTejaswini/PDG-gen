import java.util.Scanner;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int i,j=0,k=0,sum=0,ave=0;

		while(true){
			int n = sc.nextInt();
			if(n==0)break;
			int score[] = new int [n];

			for(i=0;i<n;i++){
				score[i] = sc.nextInt();
				sum+=score[i];
			}
			for(i=0;i<n;i++){
				if(score[i]>=score[j]){
					j=i;
				}else if(score[i]<=score[k]){
					k=i;
				}
			}
			sum-=score[j];
			sum-=score[k];
			ave = sum/(n-2);
			System.out.printf("%d\n",ave);
			sum=0;
			ave=0;
		}
	}
}