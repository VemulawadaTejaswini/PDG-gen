import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
			while(true) {
				int n=sc.nextInt();
				if(n==0) {break;}
				int score[]=new int[n];
			for(int i=0;i<score.length;i++) {
				score[i]=sc.nextInt();
			}
			double average=0, variance=0;
			for(int i=0;i<score.length;i++) {
				average=average+(double)score[i];
			}
			average=average/(double)score.length;
			for(int i=0;i<score.length;i++) {
				variance=variance+Math.pow(score[i]-average,2.0);
			}
			variance=variance/(double)score.length;
			System.out.println(Math.sqrt(variance));
			
		}
	}
	

}
}
