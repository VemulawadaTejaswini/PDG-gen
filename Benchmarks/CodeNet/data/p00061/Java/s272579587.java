import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int[][] d = new int[31][10000];
		int[] idx = new int[31];
		while(true){
			String[] tmp = stdIn.next().split(",");
			int num = Integer.parseInt(tmp[0]);
			int ans = Integer.parseInt(tmp[1]);
			if((num|ans)==0){
				break;
			}
			d[ans][idx[ans]++] =num;
		}
		while(stdIn.hasNext()){
			int call = stdIn.nextInt();
			int rank = 0;
			LOOP : {
				for(int i=30;i>=0;i--){
					if(idx[i]>0){
						rank++;
					}
					for(int j=0;j<idx[i];j++){
						if(call==d[i][j]){
							System.out.println(rank);
							break LOOP;
						}
					}
				}
			}
		}
	}
}