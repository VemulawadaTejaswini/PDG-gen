import java.util.Scanner;

  class Main{
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	 int data[][][] = new int[4][3][10];
	 int n, b, f, r, v, i, j, k;
	 n = scan.nextInt();
	   
	 for(i = 0; i < 4; i++) {
	  for(j = 0; j < 3; j++) {
	   for(k = 0; k < 10; k++) {
	    data[i][j][j] = 0;
	   }
	  }
	 }
	   
	 for(i = 0; i < n; i++) {
	  b = scan.nextInt();
	  f = scan.nextInt();
	  r = scan.nextInt();
	  v = scan.nextInt();
	  data[b-1][f-1][r-1] += v;
	 }
	   
	 for(i = 0; i < 4; i++) {
	  for(j = 0; j < 3; j++) {
	   for(k = 0; k < 10; k++) {
		System.out.print(" " + data[i][j][k]);
	   }
	   System.out.println("");
	  }
	  if(i != 3) {
	  System.out.println("####################");
	  }
	 }

	}
}