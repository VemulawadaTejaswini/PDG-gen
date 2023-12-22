import java.util.*;

class Main{
	int n;
	int[] ai;
	Scanner scan = new Scanner(System.in);
	public Main(){
		n=scan.nextInt();
		ai=new int[n];
		for(int i=0; i<n; i++){
			ai[i]=scan.nextInt();
		}
		int min=1000000;
		for(int i=0; i<n; i++){
			if(min>ai[i])min=ai[i];
		}
		int max=-1000000;
		for(int j=0; j<n; j++){
			if(max<ai[j])max=ai[j];
		}
		long sum=0;
		for(int k=0; k<n; k++){
			sum=sum+ai[k];
		}
		System.out.println(min+" "+max+" "+sum);
	}
	public static void main(String[]args){
		new Main();
	}
}