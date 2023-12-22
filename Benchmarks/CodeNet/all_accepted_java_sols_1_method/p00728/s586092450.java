import java.util.Scanner;

public class Main {
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		int score[]=new int[100];
		while(true){
		int n= sc.nextInt();
		if(n==0){ 
			break;
		}else{
		score[0]=sc.nextInt();
		int Sum=score[0];
		int Max= score[0];
		int min = score[0];
	for(int i=1;i<n;i++){
		score[i]=sc.nextInt();
		Sum = Sum+score[i];
		if(Max<score[i]){
			Max=score[i];
		}
		if(min>score[i]){
			min=score[i];
		}
	}
	System.out.println((Sum-Max-min)/(n-2));
	}
		}
	}
}