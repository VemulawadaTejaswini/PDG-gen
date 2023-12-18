import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int[] a = new int[N];
		for(int i = 0;i < N;i++){
			a[i] = s.nextInt();
		}
		
		int alice = 0;
		int bob = 0;
		for(int i = 0;i < N;i++){
			int max = 0;
			int c = -1;
			for(int j = 0;j < N;j++){
				if(a[j] > max){
					c = j;
					max = a[j];
				}
			}
			a[c] = 0;
			if(i % 2 == 0){
				
				alice += max;
			}else{
				
				bob += max;
			}
		}
		
		System.out.println(alice - bob);
	}

}
