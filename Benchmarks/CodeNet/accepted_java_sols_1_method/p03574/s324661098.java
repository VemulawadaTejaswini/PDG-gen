import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();

		String[][] map = new String[H][W];
		for(int i=0; i<H; i++){
			for(int j=0; j<W; j++){
				map[i][j] = "0";
			}
		}

		for(int i=0; i<H; i++){
			String S = sc.next();
			for(int j=0; j<W; j++){
				String str = String.valueOf(S.charAt(j));
				if(str.equals("#")){
					map[i][j]="#";
					if(i+1!=H&&!(map[i+1][j].equals("#"))){
						map[i+1][j] = String.valueOf(Integer.parseInt(map[i+1][j])+1);
						if(j-1!=-1&&!(map[i+1][j-1].equals("#"))){
							map[i+1][j-1] = String.valueOf(Integer.parseInt(map[i+1][j-1])+1);;
						}
						if(j+1!=W&&!(map[i+1][j+1].equals("#"))){
							map[i+1][j+1] = String.valueOf(Integer.parseInt(map[i+1][j+1])+1);;
						}
					}
					if(i-1!=-1){
						if(!(map[i-1][j].equals("#"))){
							map[i-1][j] = String.valueOf(Integer.parseInt(map[i-1][j])+1);
						}
						
						if(j-1!=-1&&!(map[i-1][j-1].equals("#"))){
							map[i-1][j-1] = String.valueOf(Integer.parseInt(map[i-1][j-1])+1);;
						}
						if(j+1!=W&&!(map[i-1][j+1].equals("#"))){
							map[i-1][j+1] = String.valueOf(Integer.parseInt(map[i-1][j+1])+1);;
						}
					}
					if(j-1!=-1&&!(map[i][j-1].equals("#"))){
						map[i][j-1] = String.valueOf(Integer.parseInt(map[i][j-1])+1);
					}
					if(j+1!=W&&!(map[i][j+1].equals("#"))){
						map[i][j+1] = String.valueOf(Integer.parseInt(map[i][j+1])+1);
					}
				}
			}
		}

		for(int i=0; i<H; i++){
			String str = "";
			for(int j=0; j<W; j++){
				str += map[i][j];
			}
			System.out.println(str);
		}
    }
}
