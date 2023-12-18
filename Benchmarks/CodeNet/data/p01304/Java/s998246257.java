import java.util.*;
public class Main {
	private static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		byte a = sc.nextByte();
		for (int l=0; l<a; l++){
			byte gx=sc.nextByte();
			byte gy=sc.nextByte();
			byte No [][] = new byte [gx+1][gy+1];
			byte b = sc.nextByte();
			for (int k=0; k<b; k++){
				byte x1=sc.nextByte();
				byte y1=sc.nextByte();
				byte x2=sc.nextByte();
				byte y2=sc.nextByte();
				
				if (x1 == x2) {
					No [x1][(Math.max(y1, y2))]+=1;
				}
				else {No[(Math.max(x1,x2))][y1]+=2;}			
			}
			int Total[][] = new int [gx+1][gy+1];
			Total[0][0] = 1;
			for (int i=0; i<=gx; i++){
				for (int j=0; j<=gy; j++){
					if (No[i][j] == 0){
						if (i>0 & j>0){
							Total[i][j]=Total[i-1][j]+Total[i][j-1];
						}
						else if (i>0){
							Total[i][j]=Total[i-1][j];
						}
						else if (j>0){
							Total[i][j]=Total[i][j-1];
						}
						else;
					}
					else if(No[i][j] == 1){
						if (i>0){
							Total[i][j]=Total[i-1][j];
							}
						else Total[i][j]=0;
					}
					else if(No[i][j] == 2){
						if (j>0){
						Total[i][j]=Total[i][j-1];
						}
						else Total[i][j]=0;
					}
					else {
						Total[i][j]=0;
					}
				}
			}
			if (Total[gx][gy]==0){
				System.out.println("Miserable Hokusai!");
			}
			else {System.out.println(Total[gx][gy]);
			}
		}
	}
}