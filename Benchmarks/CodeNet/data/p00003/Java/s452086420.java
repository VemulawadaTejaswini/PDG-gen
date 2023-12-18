import java.io.*;

public class Main {
	
	private static final int adge1=0;
	private static final int adge2=1;
	private static final int adge3=2;
	public static void main(String[] a) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int[][] tryangle= new int[num][3];

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < tryangle[i].length; j++) {
				tryangle[i][j] = Integer.parseInt(br.readLine());
			}
			System.out.println();
		}
		
		int a,b,c;
		for(int i=0;i<num;i++){
			a = tryangle[i][adge1]*tryangle[i][adge1];
			b = tryangle[i][adge2]*tryangle[i][adge2];
			c = tryangle[i][adge3]*tryangle[i][adge3];
			if(((a+b)==c)||((b+c)==a)||((a+c)==b)) System.out.println("YES");
			else System.out.println("NO");
		}
	}
}