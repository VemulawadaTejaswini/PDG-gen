import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int last=0,rx=10,ry=10;
			int n = sc.nextInt();
			int ne = n;
			int gem[][] = new int[300][300];
			int rob[][] = new int[300][300];
			if(n==0){
				System.exit(0);
			}
			for(int i=0;i<n;i++){
				int x= sc.nextInt();
				int y= sc.nextInt();
				gem[x][y] = 1;
			}
			n = sc.nextInt();
			for(int i=0;i<n;i++){
				String dir = sc.next();
				int k = sc.nextInt();
				if(dir.equals("N")){
					for(int j=1;j<=k;j++){
						rob[rx][ry+j]++;
						if(rob[rx][ry+j]==gem[rx][ry+j]){
							last++;
							gem[rx][ry+j]=0;
						}
					}
					ry=ry+k;
				}else if(dir.equals("S")){
					for(int j=1;j<=k;j++){
						rob[rx][ry-j]++;
						if(rob[rx][ry+j]==gem[rx][ry-j]){
							last++;
							gem[rx][ry-j]=0;
						}
					}
					ry=ry-k;
				}else if(dir.equals("E")){
					for(int j=1;j<=k;j++){
						rob[rx+j][ry]++;
						if(rob[rx+j][ry]==gem[rx+j][ry]){
							last++;
							gem[rx+j][ry]=0;
						}
					}
					rx=rx+k;
				}else if(dir.equals("W")){
					for(int j=1;j<=k;j++){
						rob[rx-j][ry]=1;
						if(rob[rx-j][ry]==gem[rx-j][ry]){
							last++;
							gem[rx-j][ry]=0;
						}
					}
					rx=rx-k;
				}
			}
			if(last==ne){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
		}
	}

}