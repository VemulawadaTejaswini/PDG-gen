import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int q = scan.nextInt();
		int[] p = new int[n];
		int max;
		int tI = 0;
		for(int i = 0;i < q;i++){
			p[scan.nextInt()-1] += scan.nextInt();
			max = p[0];
			tI = 0;
			for(int j = 1;j < n;j++){
				if(max < p[j]){
					tI = j;
					max = p[j];
				}
			}
			System.out.println(tI+1 + " " + p[tI]);
		}
	}
}