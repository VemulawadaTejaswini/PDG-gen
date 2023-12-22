import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[][] array=new int[12][10];
		for(int i=1; i<=n; i++){
			int bui=sc.nextInt();
			int fl=sc.nextInt();
			int ro=sc.nextInt();
			int ppl=sc.nextInt();
			array[(bui-1)*3+fl-1][ro-1]+=ppl;
		}
		for(int i=0; i<array.length; i++){
			for(int j=0; j<array[0].length; j++){
				System.out.print(" "+array[i][j]);
			}
			System.out.println();
			if((i+1)%3==0 && (i+1)!=12){
				System.out.println("####################");
			}
		}


	}




}
