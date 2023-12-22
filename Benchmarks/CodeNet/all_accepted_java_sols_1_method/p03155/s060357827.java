import java.util.Scanner;
class Main{
	
	public static void main(String[] args) {
		Scanner Cf=new Scanner(System.in);
		int N=Cf.nextInt();
		int H=Cf.nextInt();
		int W=Cf.nextInt();
		
		int rows=N;
		int columns=N;
		
		int diffROWS=rows-H;
		int diffColumns=columns-W;
		
		diffROWS=diffROWS+1;
		diffColumns=diffColumns+1;
		System.out.println(diffColumns*diffROWS);
		
		
	}

}
