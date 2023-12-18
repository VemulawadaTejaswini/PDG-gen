import java.awt.geom.Point2D;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		String str = br.readLine();
//		int n = Integer.parseInt(br.readLine());
		
		String[] tmpArray = str.split(" ");
		
		Point2D.Double p1 = new Point2D.Double(Double.parseDouble(tmpArray[0]), Double.parseDouble(tmpArray[1]));
		Point2D.Double p2 = new Point2D.Double(Double.parseDouble(tmpArray[2]), Double.parseDouble(tmpArray[3]));
		
		System.out.println(p1.distance(p2));
		

//		System.out.println(count);

//
//			if(Character.isLowerCase(c)){
//				System.out.print(Character.toUpperCase(c));
//			}
//
//			else if(Character.isUpperCase(c)){
//				System.out.print(Character.toLowerCase(c));
//			}
//			else {
//				System.out.print(c);
//			}
//		}
//		System.out.println();

//		String[] tmpArray = br.readLine().split(" ");
//		int n = Integer.parseInt(tmpArray[0]);
//		int m = Integer.parseInt(tmpArray[1]);
//		int l = Integer.parseInt(tmpArray[2]);
//
//		long[][] a = new long[n][m];
//		long[][] b = new long[m][l];
//		long[][] c = new long[n][l];
//
//		for(int i = 0; i < n; i ++){
//			tmpArray = br.readLine().split(" ");
//			for(int j = 0; j < m; j++){
//				a[i][j] = Long.parseLong(tmpArray[j]);
//			}
//		}
//
//		for(int i = 0; i < m; i ++){
//			tmpArray = br.readLine().split(" ");
//			for(int j = 0; j < l; j++){
//				b[i][j] = Integer.parseInt(tmpArray[j]);
//			}
//		}
//
//		for(int i = 0; i < n; i++){
//			for(int j = 0; j < l; j++){
//				for(int k = 0; k < m; k++){
//					c[i][j] += a[i][k]*b[k][j];
//				}
//
//				if(j != 0 ){
//					System.out.print(" ");
//				}
//				System.out.print(c[i][j]);
//			}
//			System.out.println();
//		}


	}

}