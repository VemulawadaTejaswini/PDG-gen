import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			int q = scan.nextInt();
			int[] card = new int[n];
			for(int i = 0;i < n;i++){
				card[i] = scan.nextInt();
			}
			for(int i = 0;i < q;i++){
				int qq = scan.nextInt();
				int max = 0;
				for(int j = 0;j < n;j++){
					int t = card[j] % qq;
					if(max == 0 || max < t){
						max = t;
					}
				}
				System.out.println(max);
			}
		}
	}
}