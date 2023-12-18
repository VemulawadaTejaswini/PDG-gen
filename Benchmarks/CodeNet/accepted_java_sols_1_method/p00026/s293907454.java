import java.util.Scanner;
public class Main{
	public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int s = 10;
        int[][] map = new int[s][s];
        int[] dx = {0,-1,1,0,0,-1,-1,1,1,-2,0,0,2};
        int[] dy = {0,0,0,-1,1,-1,1,-1,1,0,-2,2,0};
        int[] size = {5,9,13};
        while(scan.hasNext()){
        	String[] com = scan.nextLine().split(",");
        	int x = Integer.parseInt(com[0]);
        	int y = Integer.parseInt(com[1]);
        	int t = Integer.parseInt(com[2]) - 1;
        	for(int i = 0;i < size[t];i++){
        		if(x+dx[i] >= 0 && x+dx[i] < s && y+dy[i] >= 0 && y+dy[i] < s){
        			map[y+dy[i]][x+dx[i]] += 1;
        		}
        	}
        }
        int max = 0;
        int count = 0;
        for(int i = 0;i < s;i++){
        	for(int j = 0;j < s;j++){
        		max = Math.max(max,map[i][j]);
        		count += (map[i][j] > 0)?0:1;
        	}
        }
        System.out.println(count + "\n" + max);
    }
}