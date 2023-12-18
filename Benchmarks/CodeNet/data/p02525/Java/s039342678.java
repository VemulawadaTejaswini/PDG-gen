import java.util.Scanner;

public class Main{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		while(true){

			int sum=0,n=sc.nextInt();
			if(n==0){

				break;
			}

			int[] scores=new int[n];

			for(int i=0;i<scores.length;i++){

				scores[i]=sc.nextInt();
				sum+=scores[i];
			}

			double average=0,variance=0;

			average=sum/n;