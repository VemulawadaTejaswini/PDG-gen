import java.util.Scanner;

public class Main {

	static int min;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] s = new int[M];
		int[] c = new int[M];
		for(int i = 0;i < M;i++){
			s[i] = sc.nextInt();
			c[i] = sc.nextInt();
		}
		sc.close();
		if(N==1){
			min = 0;
		}else{
			min = (int)Math.pow(10, N-1);
		}
		for(int i = min;i < (int)Math.pow(10, N);i++){
			String str = String.valueOf(i);
			boolean b = true;
			for(int j = 0;j < M;j++){
				if(!str.substring(s[j]-1,s[j]).equals(String.valueOf(c[j]))){
					b = false;
					break;
				}
			}
			if(b){
				System.out.println(i);
				return;
			}
		}
		System.out.println(-1);
	}
}