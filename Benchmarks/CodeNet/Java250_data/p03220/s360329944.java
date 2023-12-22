import java.util.Scanner;
public class Main{
	public static void main(String[] argv){
		Scanner scan = new Scanner(System.in);
		palace(scan);
	}
	public static void palace(Scanner scan){
		//入力値の中で，最もAに近いもののインデックスを出力
		int N = scan.nextInt(); 
		int T = scan.nextInt(); int A = scan.nextInt();
		int in = scan.nextInt();
		int index = 1;
		double min = Math.abs(A-T+0.006*in);
		for(int i=2;i<=N;i++){
			in = scan.nextInt();
			double dif = Math.abs(A-T+0.006*in);
			if(min>dif){
				min = dif;
				index = i;
			}
		}
		System.out.println(index);
	}
}