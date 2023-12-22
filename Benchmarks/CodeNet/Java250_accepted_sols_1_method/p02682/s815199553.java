import java.util.Scanner;
 
public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();	//1が書かれたカードの枚数
		int B = in.nextInt();	//0が書かれたカードの枚数
		int C = in.nextInt();	//-1が書かれたカードの枚数
		int K = in.nextInt();	//取る枚数
		int max = 0;		//最大値
 
		if(K<=A){
			max = K;
		}
		if(K>A){
			if(K<=(A+B)){
				max = A;
			}
			if(K>(A+B)){
				max = A - (K-A-B);
			}
		}
 
		System.out.println(max);
	}
}