import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		int[][][] count=new int[4][3][10];
		Scanner scan = null;
		try{
			scan =new Scanner(System.in);
			int n = scan.nextInt();
			int b,f,r,v;
			for(int i = 0 ; i < n;i++){
				b = scan.nextInt();
				f = scan.nextInt();
				r = scan.nextInt();
				v = scan.nextInt();
				count[b - 1][f - 1][r - 1] += v;
			}
		}finally{
			if(scan !=null)scan.close();
		}
		for(int i = 0; i < count.length;i++){
			if(i !=0 ){
				for(int j = 0 ; j < 20;j++){
					System.out.print("#");
				}
				System.out.println();
			}
			for(int j = 0 ; j < count[i].length;j++){
				for(int k = 0 ; k < count[i][j].length;k++){
					System.out.printf(" %d",count[i][j][k]);
				}
				System.out.println();
			}
		}
	}
}