
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int i, cnt = 0;
		boolean flag = false;
		int N = sc.nextInt();
		String name = sc.next();
		String[] board = new String[N];
		for(i=0; i<N; i++)board[i] = sc.next();
		
		int num, j, k, x, y=0, yy = 0, space = 0;
		char[] nameC = name.toCharArray();
		
A:		for(num=0; num<board.length; num++){
B:			for(i=0; i<board[num].length(); i++){
				x = board[num].indexOf(nameC[0], i);
				if(x<0)continue A;
				for(j=0; j+i<board[num].length(); j++){
					if(y == 0){
						y = board[num].indexOf(nameC[1], x);
						yy = y;
					}
					else y = board[num].indexOf(nameC[1], yy);
					yy = y;
					if(y<0)continue B;
					space = y - x;
					for(k=0; k+2<name.length(); k++){
						flag = false;
						if(board[num].indexOf(nameC[k+2]) -board[num].indexOf(nameC[k+1]) == space){
							flag = true;
							if(k+2 == name.length() -1){
								cnt++;
								continue A;
							}
						}
						if(flag = false)break;
					}
				}
			}
		}
		System.out.println(cnt);
	}
}