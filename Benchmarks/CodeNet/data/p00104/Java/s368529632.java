import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args){
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int height, width, hpos, wpos;

		for(;;){
			height = scanner.nextInt();
			width = scanner.nextInt();
			if(height == 0||width == 0) break;

			String[] mark = new String[height];

			for(int i = 0; i < height; i++){
				mark[i] = scanner.next();
			}

			hpos = wpos = 0;
			for(int i = 0;; i++){
				if(i == (height * width)){
					System.out.println("LOOP");
					break;
				}else if(mark[hpos].charAt(wpos) == '>'){
					wpos++;
				}else if(mark[hpos].charAt(wpos) == '<'){
					wpos--;
				}else if(mark[hpos].charAt(wpos) == '^'){
					hpos--;
				}else if(mark[hpos].charAt(wpos) == 'v'){
					hpos++;
				}else if (mark[hpos].charAt(wpos) == '.'){
					System.out.printf("%d %d\n", wpos, hpos);
					break;
				}
			}
		}
	}
}