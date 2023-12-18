import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int c[][]=new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				c[i][j]=scan.nextInt();
			}
		}
		scan.close();
		int check=0;
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				if(c[j][i]-c[j][i+1] !=  c[j+1][i]-c[j+1][i+1]) {
					check=1;break;
				}
			}
			if(check==1)break;
		}

		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				if(c[i][j]-c[i+1][j] !=  c[i][j+1]-c[i+1][j+1]) {
					check=1;break;
				}
			}
			if(check==1)break;
		}

		System.out.println((check==0)?"Yes":"No");
	}

}