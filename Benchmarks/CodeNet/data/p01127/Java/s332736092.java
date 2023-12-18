import java.util.ArrayList;
import java.util.Scanner;

/**
 * X-Ray Screening System
 *  URL:http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=2002
 *
 * @author Igari Kazuya
 *
 */
public class Main {
	private static ArrayList<Integer> usemapint;

	public static void addList(int num){
		for(int i=0;i<usemapint.size();i++){
			if(usemapint.get(i) == num){
				return ;
			}
		}
		usemapint.add(num);
	}

	public static boolean check(int[][] map, int num){
		int startX = map[0].length;
		int endX = -1;
		int startY = map.length;
		int endY = -1;
		for(int y=0;y<map.length;y++){
			for(int x=0; x < map[0].length ;x++){
				if(map[y][x] == num){
					if(x < startX){
						startX = x;
					}
					if(endX < x){
						endX = x;
					}
					if(y < startY){
						startY = y;
					}
					if(endY < y){
						endY = y;
					}
				}
			}
		}

		for(int y=startY;y<=endY;y++){
			for(int x=startX;x<=endX;x++){
				if(map[y][x] != num && map[y][x] != -1){
					return false;
				}
			}
		}

		for(int y=startY;y<=endY;y++){
			for(int x=startX;x<=endX;x++){
				map[y][x] = -1;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int loop;
		loop = sc.nextInt();

		for(int i=0;i<loop;i++){
			int h,w;
			h = sc.nextInt();
			w = sc.nextInt();
			int[][] map = new int[h][w];
			usemapint = new ArrayList<Integer>();
			boolean flag = true;

			for(int y=0;y<h;y++){
				String buf;
				buf = sc.nextLine();
				if(buf.equals("")){
					buf = sc.nextLine();
				}
				for(int x=0;x<w;x++){
					if(buf.charAt(x) == '.'){
						map[y][x] = 0;
					}else{
						map[y][x] = buf.charAt(x) - ('A' - 1);
						addList(map[y][x]);
					}
				}
			}

			while(flag){
				flag = false;
				for(int j=0; j<usemapint.size();j++){
					if(check(map,usemapint.get(j))){
						flag = true;
						usemapint.remove(j);
						break;
					}
				}
			}

			if(usemapint.isEmpty()){
				System.out.println("SAFE");
			}else{
				System.out.println("SUSPICIOUS");
			}
		}
	}
}