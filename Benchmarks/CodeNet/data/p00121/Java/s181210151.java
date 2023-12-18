

import java.util.*;

public class Main {

	public static int lzh(int puzzle[]){
		return puzzle[0]*10000000+puzzle[1]*1000000+puzzle[2]*100000+puzzle[3]*10000+puzzle[4]*1000+puzzle[5]*100+puzzle[6]*10+puzzle[7];
	}

	public static void changein(int puzzle[],LinkedList<Integer> que,int a,int b,int cnt){
		int[] puzzle_ = new int[8];
		for(int i=0;i<8;i++){
			puzzle_[i]=puzzle[i];
		}
		puzzle_[a]=puzzle[b];
		puzzle_[b]=puzzle[a];

		que.offer(lzh(puzzle_));
		que.offer(cnt+1);
	}

	public static int solve(int puzzle[]){

		LinkedList<Integer> que = new LinkedList<Integer>();
		boolean[] memo = new boolean[76543211];
		int a=0;
		int now,cnt=0;
		int wzero=0;

		//はじめの配置
		a=lzh(puzzle);
		que.offer(a);
		que.offer(0);

		while(que.size()>0){
			now=que.poll();
			cnt=que.poll();
			if(memo[now])		//前に調べたことがあるからtbs
				continue;
			else
				memo[now]=true;

			if(now==1234567)
				break;

			for(int i=0;i<8;i++){
				puzzle[i]=(now/(int)Math.pow(10, 7-i))%10;
				if(puzzle[i]==0) wzero=i;
			}

			if(wzero==0){
				changein(puzzle,que,0,1,cnt);
				changein(puzzle,que,0,4,cnt);
			}

			if(wzero==4){
				changein(puzzle,que,4,5,cnt);
				changein(puzzle,que,0,4,cnt);
			}

			if(wzero==3){
				changein(puzzle,que,2,3,cnt);
				changein(puzzle,que,3,7,cnt);
			}

			if(wzero==7){
				changein(puzzle,que,3,7,cnt);
				changein(puzzle,que,6,7,cnt);
			}

			if(wzero==1){
				changein(puzzle,que,0,1,cnt);
				changein(puzzle,que,1,5,cnt);
				changein(puzzle,que,1,2,cnt);
			}

			if(wzero==5){
				changein(puzzle,que,4,5,cnt);
				changein(puzzle,que,5,1,cnt);
				changein(puzzle,que,5,6,cnt);
			}

			if(wzero==2){
				changein(puzzle,que,1,2,cnt);
				changein(puzzle,que,2,6,cnt);
				changein(puzzle,que,2,3,cnt);
			}

			if(wzero==6){
				changein(puzzle,que,2,6,cnt);
				changein(puzzle,que,6,5,cnt);
				changein(puzzle,que,6,7,cnt);
			}

		}

		return cnt;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] puzzle = new int[8];

		while(scan.hasNext()){

			for(int i=0;i<8;i++){
				puzzle[i]=scan.nextInt();
			}
			System.out.println(solve(puzzle));

		}
	}
}