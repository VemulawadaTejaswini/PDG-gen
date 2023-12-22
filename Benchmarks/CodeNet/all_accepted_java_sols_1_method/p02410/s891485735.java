import java.util.Scanner;
/**
 * @author kawakami
 *
 */
class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner as = new Scanner(System.in);
		
		int n=as.nextInt();
		int m=as.nextInt();
		int i,j,k;
		int b,f,r,v;
		
		int mat[][];
		mat = new int[n][m];
		int vec[];
		vec = new int[m];
		int mul[];
		mul = new int[n];
		String str;
		
		for(i=0;i<n;i++){
			for(j=0;j<m;j++){
				
				mat[i][j]=as.nextInt();
				
			}
		}
		for(i=0;i<m;i++){
			
			vec[i]=as.nextInt();
			
		}
		
		for(i=0;i<n;i++){
			for(j=0;j<m;j++){
				mul[i]=mul[i]+(mat[i][j]*vec[j]);
			}
		    str=String.valueOf(mul[i]);
			System.out.println(str);
		}
		

	}

}