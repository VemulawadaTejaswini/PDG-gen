import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt();
		int n=sc.nextInt();
		int hako[] = new int[101];
		for(int i=0;i<102;i++) {
			hako[i]=0;
		}
		for(int i=0;i<n;i++) {
			int a = sc.nextInt();
			hako[a] = 1;
		}
		
		if(hako[x]==0) {
			System.out.println(x);
			return;
		}
		int up=x+1;
		int down=x-1;
		
		while(up>-1 && down<101) {
			if(hako[down] == 0) {
				System.out.println(down);
				break;
			}
			if(hako[up] == 0) {
				System.out.println(up);
				break;
			}
			up++;
			down--;
		}
		while(down<101) {
			if(hako[up] == 0) {
				System.out.println(up);
				break;
			}
			down--;
		}
		while(up>-1 && down<101) {
			if(hako[down] == 0) {
				System.out.println(down);
				break;
			}
			up++;
		}
		
		
	}
}
