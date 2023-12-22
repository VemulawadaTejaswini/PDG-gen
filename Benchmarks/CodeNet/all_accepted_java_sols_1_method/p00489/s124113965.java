import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int i, k;
		int n = sc.nextInt();
		int[] data = new int[n];
		int[] rank = new int[data.length];
		int A, B, C, D;
		for(i=0; i<data.length; i++){
			data[i] = 0;
		}
		for(i=0; i<(n*(n-1))/2; i++){
			A = sc.nextInt();
			B = sc.nextInt();
			C = sc.nextInt();
			D = sc.nextInt();
			if(C > D){
				data[A-1] += 3;
			}
			else if(C < D){
				data[B-1] += 3;
			}
			else{
				data[A-1] += 1;
				data[B-1] += 1;
			}
		}
		for(i=0; i<data.length; i++){
			int rnk = 1;
			for(k=0; k<data.length; k++){
				if(data[i] < data[k]){
					rnk++;
				}
			}
			rank[i] = rnk;
		}
		
		for(i=0; i<rank.length; i++){
			System.out.println(rank[i]);
		}
		

	}

}