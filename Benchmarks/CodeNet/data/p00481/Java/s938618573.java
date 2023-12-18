import java.util.Arrays;
import java.util.Scanner;
import java.util.LinkedList;

public class Main {
	public static void main(String args[]){
		run();
	}
	static void run(){
		Scanner scan = new Scanner(System.in);
		
		int height, width, number;
		
		String tmp;
		
		int nowX, nowY;
		
		int timeTmp;
		
		int ans;
		
		int checkX, checkY;
		
		int health = 1;
		
		int nestX = 0;
		int nestY = 0;
		
		height = scan.nextInt();
		width = scan.nextInt();
		number = scan.nextInt();
		
		char[][] map = new char[height + 2][width + 2];
		String[] mapTmp = new String[height + 2];
		int[][] timeMap = new int[height + 2][width + 2];
		int[][] timeMapTmp = new int[height + 2][width + 2];
		
		for(int i = 0; i < height + 2; i++){
			for(int j = 0; j < width + 2; j++){
				map[i][j] = 'X';
				timeMap[i][j] = -1;
			}
		}
		timeMapTmp = timeMap;
		
		for(int i = 1; i <= height; i++){
			tmp = scan.next();
			mapTmp[i - 1] = tmp;
			for(int j = 0; j < width; j++){
				map[i][j + 1] = tmp.charAt(j);
				if(map[i][j + 1] == 'S'){
					nestX = i;
					nestY = j + 1;
					timeMap[i][j + 1] = 0;
				}
			}
		}
		
		
		
		LinkedList<Integer> queueX = new LinkedList<Integer>();
		LinkedList<Integer> queueY = new LinkedList<Integer>();
		
		
		queueX.offer(nestX);
		queueY.offer(nestY);
		
		for(;;){
			
			nowX = queueX.poll();
			nowY = queueY.poll();
			
			if(map[nowX][nowY] == (char)('0' + health)){
				if(health == number){
					ans = timeMap[nowX][nowY];
					break;
				}
				
				while(!queueX.isEmpty() && !queueY.isEmpty()){
					queueX.remove();
					queueY.remove();
				}
			
				health++;
				timeTmp = timeMap[nowX][nowY];
				timeMap = timeMapTmp;
				timeMap[nowX][nowY] = timeTmp;
				
				for(int i = 1; i <= height; i++){
					for(int j = 0; j < width; j++){
						map[i][j + 1] = mapTmp[i - 1].charAt(j);
					}
				}
				
				queueX.offer(nowX);
				queueY.offer(nowY);
				continue;
			}
			
			if(map[nowX + 1][nowY] == 'X'){
			}else{
				queueX.offer(nowX + 1);
				queueY.offer(nowY);
				timeMap[nowX + 1][nowY] = timeMap[nowX][nowY] + 1;
			}
			
			if(map[nowX][nowY + 1] == 'X'){
			}else{
				queueX.offer(nowX);
				queueY.offer(nowY + 1);
				timeMap[nowX][nowY + 1] = timeMap[nowX][nowY] + 1;
			}
			
			if(map[nowX - 1][nowY] == 'X'){
			}else{
				queueX.offer(nowX - 1);
				queueY.offer(nowY);
				timeMap[nowX - 1][nowY] = timeMap[nowX][nowY] + 1;
			}
			
			if(map[nowX][nowY - 1] == 'X'){
			}else{
				queueX.offer(nowX);
				queueY.offer(nowY - 1);
				timeMap[nowX][nowY - 1] = timeMap[nowX][nowY] + 1;
			}
			
			map[nowX][nowY] = 'X';
			
			check(queueX, queueY);
		}
		System.out.println(ans);
	}
	static void check(LinkedList<Integer> queueX, LinkedList<Integer> queueY){
		for(int i = 0; i < queueX.size(); i++){
			int checkX = queueX.get(i);
			int checkY = queueY.get(i);
			for(int j = i + 1; j < queueX.size(); j++){
				if(checkX == queueX.get(j) && checkY == queueY.get(j)){
					queueX.remove(j);
					queueY.remove(j);
					check(queueX, queueY);
				}
			}
		}
	}
}