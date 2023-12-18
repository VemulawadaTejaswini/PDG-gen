import java.util.*;
//import java.util.stream.Collectors;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int h = Integer.parseInt(sc.next());
		int w = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		char[][] c = new char[h][w];
		for(int i=0; i<m; i++){
			c[Integer.parseInt(sc.next()) - 1][Integer.parseInt(sc.next()) - 1] = 'o';
		}
		int max = 0;
		for(int i=0; i<h; i++){
			for(int j=0; j<w; j++){
				int count = 0;
				char[][] checked = new char[h][w];
				for(int x=0; x<h; x++){
					if(c[x][j] == 'o' && checked[x][j] != 'o'){
						count++;
						checked[x][j] = 'o';
					}
					for(int y=0; y<w; y++){
						if(c[i][y] == 'o' && checked[i][y] != 'o'){
							count++;
							checked[i][y] = 'o';
						}
					}
				}
				if(max < count){
					max = count;
				}
			}
		}
		
		System.out.println(max);
	}
}
