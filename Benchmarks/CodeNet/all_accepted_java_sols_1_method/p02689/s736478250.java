import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int H[] = new int[N];
		int COUNT[] = new int[N];
		Arrays.fill(COUNT, 0);
		int A = 0;
		int B = 0;
		for(int i=0; i<N; i++) {
			H[i] = sc.nextInt();
		}
		int count = 0;
		//HのA番目B番目を比べ、良い展望台といえる場合は1
		//そうでなければ2を配列COUNT[]に入れる
		for(int i=0; i<M; i++) {
			A = sc.nextInt();
			B = sc.nextInt();
			if(H[A-1]<H[B-1]) {
				COUNT[A-1]=2;
				if(COUNT[B-1]!=2) {
					COUNT[B-1]=1;
				}
			}else if(H[A-1]>H[B-1]) {
				if(COUNT[A-1]!=2) {
					COUNT[A-1]=1;
				}
				COUNT[B-1]=2;
			}else if(H[A-1]==H[B-1]) {
				COUNT[A-1]=2;
				COUNT[B-1]=2;
			}
		}
		//良い展望台であるとき(1と道が存在しない0のとき)
		//カウント+1して表示させる
		for(int i=0; i<N; i++) {
			if(COUNT[i]==1 || COUNT[i]==0) {
				count++;
			}
		}
		
		System.out.print(count);
	}
}