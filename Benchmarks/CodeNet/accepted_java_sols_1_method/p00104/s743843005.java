import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int w = scan.nextInt();
			int h = scan.nextInt();
			if(w == 0 && h == 0){
				break;
			}
			char[][] tile = new char[w][];
			for(int i = 0;i < w;i++){
				tile[i] = scan.next().toCharArray();
			}
			int i = 0;
			int j = 0;
			boolean[][] fl = new boolean[w][h];
			while(true){
				if(fl[i][j]){
					System.out.println("LOOP");
					break;
				}
				fl[i][j] = true;
				if(tile[i][j] == '.'){
					System.out.println(j + " " + i);
					break;
				}else if(tile[i][j] == '>'){
					j++;
				}else if(tile[i][j] == '<'){
					j--;
				}else if(tile[i][j] == '^'){
					i--;
				}else if(tile[i][j] == 'v'){
					i++;
				}
			}
		}
	}
}