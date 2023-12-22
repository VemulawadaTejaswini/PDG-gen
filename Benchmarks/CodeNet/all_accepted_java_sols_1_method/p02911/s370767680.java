import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			
			int N = scan.nextInt();
			int K = scan.nextInt();
			int Q = scan.nextInt();
			
			int[] A = new int[Q];//i番目に誰が正解したか
			int[] point = new int[N];//N人それぞれ何回正解したか?最初は皆０
			String[] kuria = new String[N];//N人それぞれがクリアしたかどうか
			
			for(int i =0;i<Q;i++) {
				A[i] = scan.nextInt();	
			}
			
			for(int i =0;i<Q;i++) {//Q回正解したのでポイント整理 
				point[A[i]-1]++;//i番目に正解した人に一ポイント	
			}
			
			for(int i = 0;i<N;i++) {//N人のポイント調整
				point[i]=point[i]+K-Q;
				if(point[i]>0) {
					kuria[i] = "Yes";
				}else{
					kuria[i] = "No";
				}
				
			}
			
			for(int i = 0;i<N;i++) {
				System.out.println(kuria[i]);
			}
			
			
			
			
			
			
		}
		
		
	}
		

}
