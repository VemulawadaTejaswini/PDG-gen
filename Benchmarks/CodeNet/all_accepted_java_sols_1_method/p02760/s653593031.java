import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int bingo[][] = new int[3][3];
		int B[][] = new int[3][3];
		int count[] = new int [8];
		for(int i=0;i<3;i++) {
			for(int j =0; j<3;j++) {
				bingo[i][j] = sc.nextInt();
			}
		}
		int N = sc.nextInt();
		for(int i=0;i<N;i++) {
			int taget = sc.nextInt();
			for(int s=0;s<3;s++) {
				for(int j =0; j<3;j++) {
					if(taget==bingo[s][j]) {
						B[s][j] =1;
						if(s == 0)count[0]++;
						if(s == 1)count[1]++;
						if(s == 2)count[2]++;
						if(j == 0)count[3]++;
						if(j == 1)count[4]++;
						if(j == 2)count[5]++;
						if(s == j)count[6]++;
						if(s+j==2 )count[7]++;
						break;
						
						
					}
				}
			}
		}
		boolean s = false;
		for(int i=0;i<8;i++) {
			if(count[i] == 3) {
				s =true;
				break;
			}
		}
		if(s == true ) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		
		
		
		
	}
}


	