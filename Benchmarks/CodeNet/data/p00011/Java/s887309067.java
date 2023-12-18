
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w=sc.nextInt();
		int n=sc.nextInt();
		int[][] list=new int[n][2];
		int[] answer=new int[w];

		for(int i=0; i<n; i++){
			String str=sc.next();
			String[] ab=str.split(",");
			list[i][0]=Integer.parseInt(ab[0]);
			list[i][1]=Integer.parseInt(ab[1]);
		}




		sc.close();

		//MyBLAS.Calc.pMat(list);

		for(int i=1; i<=w; i++){
			int c=move(list,i);
			answer[c-1]=i;
		}

		for(int k=0; k<w; k++){
			System.out.println(answer[k]);
		}



	}

	public static int move(int[][] a,int b){

		for(int i=0; i<a.length; i++){
			if(b==a[i][0]){
				b=a[i][1];
			}else if(b==a[i][1]){
				b=a[i][0];
			}
		}
		return b;
	}
}