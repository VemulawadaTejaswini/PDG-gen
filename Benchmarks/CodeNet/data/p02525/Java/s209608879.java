import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);

		while (true){
			int n,sum=0;
			double average,variance=0;
			n =sc.nextInt();
			if (n==0){break;}
			int[] scores=new int[n];
			for(int i=0; i<scores.length; i++){
				scores[i]=sc.nextInt();
				sum=sum + scores[i];
			}
			for(int i=0; i<scores.length; i++){
				average= sum / scores.length;
				variance= variance + ((scores[j]-average)*(scores[j]-average)); 
			}
						
			System.out.println(Math.sqrt(variance/n));
			}
	}
}