import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int minR=sc.nextInt();
		int maxR=-1000000000;
		for(int i=1;i<n;i++){
			int R=sc.nextInt();
			maxR=Math.max(maxR,R-minR);
			minR=Math.min(minR, R);
		}
		System.out.println(maxR);
	}

}