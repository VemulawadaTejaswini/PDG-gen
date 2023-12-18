import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int interviewNum = sc.nextInt();
		int foodNum = sc.nextInt();
		int[] foods = new int[foodNum];
		for(int i = 0; i < foodNum; i++)foods[i] = 0;

		for(int i = 0; i < interviewNum; i++){
			int likeNum = sc.nextInt();
			for(int j = 0; j < likeNum; j++){
				int likeId = sc.nextInt();
				foods[likeId-1]++;
			}
		}

		int ans = 0;
		for(int i : foods){
			if(i == interviewNum)ans++;
		}

		System.out.println(ans);
	}
}


