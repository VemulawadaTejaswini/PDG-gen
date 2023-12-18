import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();
		int[] Nlist = new int[N];
		for(int i=0;i<K;i++) {
			int A  = scan.nextInt();
			for(int j = 0;j<A;j++) {
				int tmp = scan.nextInt();
				Nlist[tmp-1]++;
			}
		}
		scan.close();

		int num = 0;

		for(int sum:Nlist) {
			if(sum==0) {
				num++;
			}
		}
		System.out.println(num);

	}
}