import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int max=0;
		int min=1000;
		while(true){
			int n = sc.nextInt();
			if(n==0){break;}
			int[] scores =new int[n];
			int max=0;
			int min=1000;
			for(int i = 0;i<scores.length; i++){
				if(max<scores[i]){
					max=scores[i];
				}
				if(max<scores[i]){
					min=scores[i];
				}
			}
			average=(average-min-max)/(n-2);
		}
		System.out.println(average);
	}
}