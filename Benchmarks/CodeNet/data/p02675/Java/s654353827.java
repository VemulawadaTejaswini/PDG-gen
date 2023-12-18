import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int N=scan.nextInt();
		int a=(N%100)%10;
		int b=0;
		int[][] c= {{2,4,5,7,9},{0,1,6,8},{3}};
		String[] d= {"hon","pon","bon"};
		while(true) {
			for(int i=0;i<3;i++)
				for(int j=0;j<c[i].length;j++)
					if(a==c[i][j])
						b=i;
						break;
		}
		System.out.print(d[b]);
	}

}
