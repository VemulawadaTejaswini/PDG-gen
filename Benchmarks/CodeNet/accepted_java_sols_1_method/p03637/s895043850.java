import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int N = scan.nextInt();
			int[]a = new int[N];
			int kiko = 0;
			int yon = 0;
			for(int i = 0;i<N;i++) {
				a[i] = scan.nextInt();
				if(a[i]%2==1)kiko++;
				if(a[i]%4==0)yon++;
			}
			
			int kisu = N/2+N%2;//kisu個より多い奇数があったらダメ
			
			if(kiko>kisu) {
				System.out.println("No");
			}else{//限界より小さい奇数の数
				if(kisu==0) {
					System.out.println("Yes");
				}else {
					if(N%2==1&&kiko==N/2+1) {
						if(yon+1==kiko)System.out.println("Yes");
						else System.out.println("No");
					}else{
						if(yon>=kiko)System.out.println("Yes");
						else System.out.println("No");
					}
				}
				
			}
			
		}
		
		
	}
		

}
