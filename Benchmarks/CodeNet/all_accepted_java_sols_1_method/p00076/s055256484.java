import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);


		double[][] mawasi=new double[1001][2];
		mawasi[0][0]=0;
		mawasi[0][1]=0;
		mawasi[1][0]=1.0d;
		mawasi[1][1]=0.0d;
		double now_cyouhen=0;

		double[][] matrix=new double[2][2];
		for(int i=2; i<=1000; i++) {
			now_cyouhen=Math.sqrt(i);
			matrix[0][0]=Math.sqrt(i-1)/now_cyouhen*now_cyouhen/Math.sqrt(i-1);
			matrix[0][1]=1/now_cyouhen*now_cyouhen/Math.sqrt(i-1);
			matrix[1][0]=-matrix[0][1];
			matrix[1][1]=matrix[0][0];

			mawasi[i][0]=mawasi[i-1][0]*matrix[0][0]+mawasi[i-1][1]*matrix[1][0];
			mawasi[i][1]=mawasi[i-1][0]*matrix[0][1]+mawasi[i-1][1]*matrix[1][1];
		}

		while(sc.hasNext()) {
			int tmp=sc.nextInt();
			if(tmp==-1) {
				System.exit(0);
			}
			System.out.println(mawasi[tmp][0]);
			System.out.println(mawasi[tmp][1]);
		}
	}
}
