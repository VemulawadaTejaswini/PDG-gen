import java.util.Scanner;

class P{
	int x;
	int y;

	P(int _x, int _y){
		this.x = _x;
		this.y = _y;
	}
}

public class Main {

	static int[][] checked;
	static int n;

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		while(true){
			n = stdIn.nextInt();
			if(n==0){
				return;
			}
			P[][] pos = new P[n][n];
			checked = new int[n][n];
			int loopCnt = 0;
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					int x = stdIn.nextInt();
					int y = stdIn.nextInt();
					pos[i][j] = new P(x,y);
				}
			}

//			for(int i=0;i<n;i++){
//				for(int j=0;j<n;j++){
//					System.out.print(pos[i][j].x+" "+pos[i][j].y);
//				}
//				System.out.println();
//			}

			// Process
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					TwotoOne();
//					System.err.println("テゥツ??"+i+" "+j);
					if(checked[i][j]==0){
						// テ・ツコツァテヲツィツ?i,j)テ」ツ?凝」ツつ嘉」ツδォテ」ツδシテ」ツδ療」ツ?ォテ」ツ?ェテ」ツつ凝ヲツ篠「テァツエツ「テ」ツつケテ」ツつソテ」ツδシテ」ツδ?
//						System.err.println("テ」ツδォテ」ツδシテ」ツδ療ヲツ篠「テァツエツ「テ」ツつケテ」ツつソテ」ツδシテ」ツδ?"+i+" "+j);
						int x = j;
						int y = i;
						boolean inc = true; // テ」ツつ、テ」ツδウテ」ツつッテ」ツδェテ」ツδ。テ」ツδウテ」ツδ暗」ツ?療」ツ?ヲテ」ツつ暗」ツ??」ツ??
						while(true){
							if(checked[y][x]==0){
								// テ」ツ?セテ」ツ??・ツ按ーテゥツ?氾」ツ?療」ツ?ヲテ」ツ?ェテ」ツ??」ツ?ョテ」ツ?ァテァツカツ堙」ツ?妥」ツつ?
								// ティツカツウティツキツ。テ」ツ?、テ」ツ?妥」ツつ?
								checked[y][x] = 2;
								// テヲツャツ。テ」ツ?ョテ・ツコツァテヲツィツ凖」ツつ津ヲツ崢エテヲツ鳴ーテ」ツ?凖」ツつ?
//								System.err.print(x+" "+y+"=>");
								int zx = x;
								int zy = y;
								x = pos[zy][zx].x;
								y = pos[zy][zx].y;
//								System.err.println(""+x+" "+y);

							}
							else if(checked[y][x]==1){
								// テゥツ?偲・ツ篠サテ」ツ?ョテ」ツδォテ」ツδシテ」ツδ療」ツ?ォテァツェツ?・ツ?・テ」ツ?療」ツ??
//								System.err.println("テゥツ?偲・ツ篠サテ」ツ?ョテ」ツδォテ」ツδシテ」ツδ療ァツェツ?・ツ?・テ」ツ?ァテ」ツ?療」ツ??/ テ」ツ?、テ」ツ?・テ」ツ?妥」ツ?セテ」ツ??);
								checked[y][x] = 2;
								inc = false;	// テゥツ?偲・ツ篠サテ」ツδォテ」ツδシテ」ツδ療」ツδ陛」ツδゥテ」ツつー
//								break;
							}
							else if(checked[y][x]==2){
								// テヲツ篠「テァツエツ「テ・ツ慊ーテァツつケテ」ツ?セテ」ツ?ァテヲツ按サテ」ツつ?
//								System.err.println("テァツオツづ、ツコツ?);
								if(inc) {
									// テヲツ篠津、ツサツ姪」ツδォテ」ツδシテ」ツδ療」ツ?ョテァツ卍コティツヲツ?
//									System.err.println("テヲツ篠津、ツサツ姪」ツδォテ」ツδシテ」ツδ療」ツ?ョテァツ卍コティツヲツ?);
									loopCnt++;
								}
								break;  // while(true)テ」ツ?ョbreak
							}
						}
					}
				}
			}
			System.out.println(loopCnt);
		}
	}

	private static void TwotoOne() {
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(checked[i][j]==2){
					checked[i][j] = 1;
				}
			}
		}

	}
}