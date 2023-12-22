import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int d[] = new int[N];
		for(int i=0;i<N;i++) {
			d[i]=sc.nextInt();
		}
		
		int ans = 0;
		int i=0;
		int j=0;
		for(int deli:d) {
			j=0;//ここで初期化が必要
			for(int deli2:d) {
				if(i==j) {
					//DO NOTHING
				}else {
					ans+=deli*deli2;
				}
				j++;
			}
			i++;
		}
		
		ans /= 2;
	
		System.out.println(ans);
		
	}

}
