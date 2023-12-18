import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] map = new int[14][14];
		while(sc.hasNext()){
			String temp = sc.nextLine();
			String[] str = temp.split(",");
			int x = Integer.parseInt(str[0]);
			int y = Integer.parseInt(str[1]);
			int size = Integer.parseInt(str[2]);
			int dx = x + 2;
			int dy = y + 2;
			if(size >= 1){
				map[dx][dy]++;
				map[dx-1][dy]++;
				map[dx][dy-1]++;
				map[dx+1][dy]++;
				map[dx][dy+1]++;
			}
			if(size >= 2){
				map[dx-1][dy-1]++;
				map[dx-1][dy+1]++;
				map[dx+1][dy+1]++;
				map[dx+1][dy-1]++;
			}
			if(size >= 3){
				map[dx][dy-2]++;
				map[dx-2][dy]++;
				map[dx][dy+2]++;
				map[dx+2][dy]++;
			}
			int nokori=0, max=0;
			for(int i = 2; i < 12; i++){
				for(int j = 2; j < 12; j++){
					if(map[i][j] == 0) nokori++;
					else if(map[i][j] > max) max = map[i][j];
				}
			}
			System.out.println(nokori + "\n" + max);
		}
	}
}