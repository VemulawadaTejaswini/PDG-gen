import java.io.IOException;
import java.util.Scanner;


public class Main{
	public static void main(String args[]) throws IOException{
		Scanner bf = new Scanner(System.in);
		int N = bf.nextInt();
		int T = bf.nextInt();
		int H = bf.nextInt();
		int L = bf.nextInt();
		int[][] list = new int[N][];
		for(int i=0; i<N; i++){
			list[i] = new int[2];
			list[i][0] = bf.nextInt();
			list[i][1] = bf.nextInt();
		}
		int current = 0;
		for(int i = 0; ;i = (i+1) % N){
			if(list[i][0]>0){
				list[i][0]--;
				current = (current+1)%9;
				T++;
				if(T>L){
					System.out.println(i+1);
					return;
				}
			}else if(list[i][1]>0){
				list[i][1]--;
				H++;
				list[i][0] += (current+1);
				T -= (current+1);
				current = 0;
				if(T<0){
					System.out.println(i+1);
					return;
				}
			}else{
				System.out.println(i+1);
				return;
			}
		}
	}
}