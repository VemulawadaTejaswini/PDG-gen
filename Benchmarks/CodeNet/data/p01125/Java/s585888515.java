import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		boolean[][] map;
		while(scan.hasNext()){
			int n = scan.nextInt();
			if(n == 0){
				break;
			}
			map = new boolean[21][21];
			for(int i = 0;i < n;i++){
				map[scan.nextInt()][scan.nextInt()] = true;
			}
			int m = scan.nextInt();
			int x = 10;
			int y = 10;
			int t = 0;
			int count = m;
			for(int i = 0;i < m;i++){
				String op = scan.next();
				t = scan.nextInt();
				if(op.equals("N")){
					for(int j = 0;j < t;j++){
						if(checkTresure(map,x,++y)){
							count--;
						}
					}
				}else if(op.equals("S")){
					for(int j = 0;j < t;j++){
						if(checkTresure(map,x,--y)){
							count--;
						}
					}
				}else if(op.equals("E")){
					for(int j = 0;j < t;j++){
						if(checkTresure(map,++x,y)){
							count--;
						}
					}
				}else if(op.equals("W")){
					for(int j = 0;j < t;j++){
						if(checkTresure(map,--x,y)){
							count--;
						}
					}
				}
			}
			System.out.println((count==0)?"Yes":"No");
		}
	}
	
	public static boolean checkTresure(boolean[][] map,int x,int y){
		return (map[x][y])?true:false;
	}
}