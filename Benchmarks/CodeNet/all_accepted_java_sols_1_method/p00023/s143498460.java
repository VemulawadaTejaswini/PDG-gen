import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			while(N-- != 0) {
				double[][] cir = new double[2][3];
				for(int i=0; i<2; i++) {
					for(int j=0; j<3; j++) {
						cir[i][j] = sc.nextDouble();
					}
				}
				
				int ans = 0;
				double dis = Math.sqrt((cir[0][0]-cir[1][0])*(cir[0][0]-cir[1][0]) + (cir[0][1]-cir[1][1])*(cir[0][1]-cir[1][1]));
				
				if(dis > cir[0][2]+cir[1][2]) ans = 0;
				else {
					if(dis + Math.min(cir[0][2], cir[1][2]) < Math.max(cir[0][2], cir[1][2])) {
						ans = cir[0][2] < cir[1][2] ?-2:2;
					}
					else ans = 1;
				}
				System.out.println(ans);
			}
		}
	}
}

