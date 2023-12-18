import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int n = stdIn.nextInt();
		char[] target = stdIn.next().toCharArray();
		int cnt = 0;
		for(int i=0;i<n;i++){
			char[] board = stdIn.next().toCharArray();
			int interval = -1;

			char now = target[0];
			// テ、ツクツ?ヲツ鳴?・ツュツ療ァツ崢ョテ」ツδ津」ツδε」ツδ暗ヲツ篠「テァツエツ「
			Process:
				for(int k=0;k<board.length;k++){
					char search = board[k];
					// テ、ツクツ?ィツ?エテ」ツ?療」ツ?淌」ツ?凝」ツ?ョテ・ツ按、テ・ツョツ?
					if(now==search){
						// 2テヲツ鳴?・ツュツ療ァツ崢ョテ」ツ?ィテ」ツ?ョテゥツ鳴禿ゥツ堋氾ィツェツソテヲツ淞サ
						for(int m=k+1;m<board.length;m++){
							if(target[1]==board[m]){
								interval = m-k;
								// テ」ツ?づ」ツつ凝ゥツ鳴禿ゥツ堋氾」ツ?ァtargetテ」ツ?古ァツ卍サテ・ツ?エテ」ツ?療」ツ?ヲテ」ツつ凝」ツ??
								for(int p=2;p<target.length;p++){
									int next = m+interval;
									if(next>=board.length){
										break;
									}
									if(target[p]!=board[next]){
										break;
									}
									if(p+1==target.length){
										// テ」ツ?。テ」ツつε」ツつ禿」ツ?ィテァツ卍サテ・ツ?エテ」ツ?療」ツ?ヲテ」ツ?甘」ツつ鈎reakテ」ツ?崚」ツ?堙・ツ按ーテゥツ??
										cnt++;
//										System.out.println("ok :"+String.valueOf(board));
										break Process;	// テ、ツサツ・テゥツ卍催ゥツ鳴禿ゥツ堋氾ィツェツソテヲツ淞サテ、ツクツ催ィツヲツ?
									}
								}
							}
						}
					}
			}
		}
		System.out.println(cnt);
	}
}