import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			int[][] point = new int[n][2];
			for(int i = 0;i < n;i++){
				point[i][0] = scan.nextInt();
				point[i][1] = scan.nextInt();
			}
			int dis = -1;
			for(int i = 0;i < n-1;i++){
				for(int j = i+1;j < n;j++){
					int t = (point[i][0]-point[j][0])*(point[i][0]-point[j][0])+(point[i][1]-point[j][1])*(point[i][1]-point[j][1]);
					if(dis < 0 || dis > t){
						dis = t;
					}
				}
			}
			System.out.println(dis);
		}
	}
}