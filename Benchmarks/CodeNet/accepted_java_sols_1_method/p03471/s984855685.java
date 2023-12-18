import java.util.*;
public class Main {
//for全探索
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int N = sc.nextInt();
		int Y = sc.nextInt();
		int ans1 = -1;
		int ans2 = -1;
		int ans3 = -1;
		for(int i = 0; i <=N;i++) {
			for(int j = 0; j <= N;j++) {
				 if((i*10000 + j*5000 + (N-i-j)*1000) == Y) {
					  if(N-i-j < 0)continue;
						ans1 = i;
						ans2 = j;
						ans3 = N-i-j;
						break;
					
				}
			}
			
		}
		System.out.println(ans1+" "+ans2+" "+ans3);
		
	}

}