import java.util.Scanner;
public class Main{
	public static void main(String[] args){
        new Main().run();
    }
	public void run(){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int an = scan.nextInt();
			int bn = scan.nextInt();
			int r = scan.nextInt();
			if(an == 0 && bn == 0){
				break;
			}
			int[][] x = new int[an][2];
			int[][] y = new int[bn][2];
			for(int i = 0;i < an;i++){
				x[i][0] = scan.nextInt();
				x[i][1] = scan.nextInt();
			}
			for(int i = 0;i < bn;i++){
				y[i][0] = scan.nextInt();
				y[i][1] = scan.nextInt();
			}
			int count = 0;
			for(int i = 0;i < an;i++){
				for(int j = 0;j < bn;j++){
					if(Math.abs(x[i][0]-y[j][0]) > 4*r || Math.abs(x[i][1]-y[j][1]) > 4*r){
						continue;
					}
					if(Math.sqrt(Math.pow(x[i][0]-y[j][1],2) + Math.pow(x[i][1]-y[j][1],2)) <= 4*r){
						count++;
					}
				}
			}
			System.out.println(count);
		}
	}
}