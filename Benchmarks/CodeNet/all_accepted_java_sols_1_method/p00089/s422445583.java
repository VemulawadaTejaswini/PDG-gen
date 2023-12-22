import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin =new Scanner(System.in);
		String[] s = new String[120];
		int count=0;
		while(cin.hasNext()){
			s[count++]=cin.next();
		}
		int[][][] a = new int[count+2][100][2];
		for(int i = 0;i<count+2;i++){
			for(int j = 0; j<100;j++){
				a[i][j][0]=-1;a[i][j][1]=0;
			}
		}
		for(int i = 1;i<=count;i++){
			String[] str = s[i-1].split(",");
			for(int j=1;j<str.length+1;j++){
				a[i][j][0]=a[i][j][1]=Integer.parseInt(str[j-1]);
			}
		}
		for(int i = 0;i<=count+1;i++){
			for(int j = 0;j <=count/2+2;j++){
				//System.out.print(a[i][j][0]);
			}
			//System.out.println();
		}
		int dx=-1;
		for(int i = 1;i<=count;i++){
			for(int j = 1;j<=count;j++){
				if(a[i][j][0]==-1){
					break;
				}
				a[i][j][1]=Math.max(a[i-1][j][1]+a[i][j][0], a[i-1][j+dx][1]+a[i][j][0]);
				//System.out.print(a[i][j][1]+" " );
			}
			if(i==count/2+1){
				dx=1;
			}
			//System.out.println();
		}
		System.out.println(a[count][1][1]);
	}
}