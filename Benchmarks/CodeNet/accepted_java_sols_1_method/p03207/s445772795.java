import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int d = sc.nextInt();
		int[] ls = new int[d];
		for(int i=0;i<d;i++) {
			ls[i]=sc.nextInt();
		}
		int max=0;
		for(int i=0;i<d;i++) {
			max=Math.max(max, ls[i]);
		}
		int sum=0;
		for(int i=0;i<d;i++) {
			if(ls[i]==max) {
				max=-1;
				ls[i]/=2;
			}
			sum+=ls[i];
		}
		System.out.println(sum);
	}

}
