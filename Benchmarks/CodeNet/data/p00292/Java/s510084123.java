import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K,P,i;
		int N = sc.nextInt();
		int [] winKei = new int[N];
		for(i=0;i<N;i++){
			K = sc.nextInt();
			P = sc.nextInt();
			if(K % P ==0){
				winKei[i] = K / P;
			}else{
				winKei[i] = K % P;
			}
		}
		for(i=0;i<N;i++){
			System.out.println(winKei[i]);
		}
	}

}