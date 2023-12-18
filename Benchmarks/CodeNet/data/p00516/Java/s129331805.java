import java.util.Scanner;
public class Main {
	static int[] Competition;
	static int[] Member;
	static int[] Voting;
	
	static void MemberStandard(int std, int Competition_num) {
		for(int r = 0; r < Competition_num; r++) {
			if(Competition[r] <= std) {
				Voting[r]++;
				break;
			}
		}
	}
	
	static int MaxVotedIdx(int Competition_num) {
		int max = Voting[0];
		int idx = 0;
		
		for(int r = 1; r < Competition_num; r++)
			if(Voting[r] > max) {
				max = Voting[r];
				idx = r;
			}
		return(idx + 1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		final int Competition_num = stdIn.nextInt();//競技数
		final int Member_num = stdIn.nextInt();//委員数
		
		Competition = new int[Competition_num];
		for(int r = 0; r < Competition_num; r++)
			Competition[r] = stdIn.nextInt();
		
		Member = new int[Member_num];
		Voting = new int[Competition_num];
		for(int r = 0; r < Member_num; r++) {
			Member[r] = stdIn.nextInt();
			MemberStandard(Member[r], Competition_num);
		}
		
		System.out.println(MaxVotedIdx(Competition_num));
	}

}