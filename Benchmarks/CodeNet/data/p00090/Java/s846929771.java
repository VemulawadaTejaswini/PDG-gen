import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = Integer.parseInt(scan.nextLine());
			if(n == 0){
				break;
			}
			double[][] point = new double[n][2];
			for(int i = 0;i < n;i++){
				String[] str = scan.nextLine().split(",");
				point[i][0] = Double.parseDouble(str[0]);
				point[i][1] = Double.parseDouble(str[1]);
			}
			int max = 1;
			int t = 1;
			for(int i = 0;i < n-1;i++){
				t = 1;
				for(int j = i+1;j < n;j++){
					if(calcDist(point[i][0],point[i][1],point[j][0],point[j][1])){
						t++;
					}
				}
				if(max < t){
					max = t;
				}
			}
			System.out.println(max);
		}
	}
	
	public static boolean calcDist(double x1,double y1,double x2,double y2){
		return (Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2)) <= 2.0)?true:false;
	}
}