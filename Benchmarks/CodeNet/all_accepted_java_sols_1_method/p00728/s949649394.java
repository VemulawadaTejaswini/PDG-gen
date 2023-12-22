import java.util.Scanner;
public class Main{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int n,s,i,x=0,ave,sum,max=0,min=10000;
		int[] aves=new int[100];
		while(true){
			sum = 0;
			max=0;
			min=10000;
			n=sc.nextInt();
			if(n==0){
				break;
			}
			int[] score=new int[n];
			for(i=0;i<n;i++){
				score[i]=sc.nextInt();
				sum = sum + score[i];
				if(score[i]>max){
					max=score[i];
				}
				if(score[i]<min){
					min=score[i];
				}
			}
			ave=(sum-max-min)/(n-2);
			aves[x]=ave;
			x++;
		}
		for(i=0;i<aves.length;i++){
			if(aves[i]==0){
				System.out.printf("");
			}
			else{
				System.out.printf("%d\n",aves[i]);
			}
		}
	}
}