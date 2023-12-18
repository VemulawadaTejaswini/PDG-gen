import java.util.Scanner;

public class Main {
	public static int main(String[] args) {
		int N = 20161;					// 解の存在する盤面の個数
		int[] pList = new int[N];		// パネル
		int[] gList = new int[N];		// 最短手数
		int[] i0List = new int[N];		// 0の位置
		
		routine(pList, gList, i0List);		// 解の存在する盤面全てをシミュレートしておく
		
		Scanner in = new Scanner(System.in);
		int input, g;
		while(in.hasNext()){
			input = 0;	g = -1;
			for(int i=0; i<8; i++)	input = input*10 + in.nextInt();
			int p;
			for(int i=0; (p=pList[i]) != 0; i++)	if(input == p){	g = gList[i];	break;}
			System.out.println(g);
		}
		
		return 0;
	}
	
	private static void routine(int[] pList, int[] gList, int[] i0List){
		int tail = 0;
		pList[0] = 1234567;
		gList[0] = 0;
		i0List[0] = 0;
		
		int panel, i0, g;
		for(int n=0; pList[n] != 0; n++){
			panel = pList[n];
			g = gList[n];
			i0 = i0List[n];
			if(i0!=0 && i0!=4)
				tail += addNextPuzzle(i0, i0-1, panel, g, pList, gList, i0List, tail);
			if(i0!=3 && i0!=7)
				tail += addNextPuzzle(i0, i0+1, panel, g, pList, gList, i0List, tail);
			if(i0>3)
				tail += addNextPuzzle(i0, i0-4, panel, g, pList, gList, i0List, tail);		
			else
				tail += addNextPuzzle(i0, i0+4, panel, g, pList, gList, i0List, tail);
		}
	}
	
	private static int addNextPuzzle(int i, int j, int panel, int g, int[] pList, int[] gList, int[] i0List, int tail){
		int newPanel, num;
		int[] place = {10000000, 1000000, 100000, 10000, 1000, 100, 10, 1};
		num = (panel/place[j])%10;
		newPanel = panel - num*place[j] + num*place[i];
		
		for(int k=0; k<=tail; k++)	if(newPanel == pList[k])		return 0;
		
		pList[tail+1] = newPanel;
		gList[tail+1] = g+1;
		i0List[tail+1] = j;
		return 1;
	}
}