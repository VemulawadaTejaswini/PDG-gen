public class Main{
	public void run(java.io.InputStream in,java.io.PrintStream out){
	java.util.Scanner sc = new java.util.Scanner(in);
/*????????§Input*/
	int N, i, j;
	int[][] a;

	N = sc.nextInt();
	a = new int[N][3];

	for(i = 0;i < N;i++){
		for(j = 0;j < 3;j++){
			a[i][j] = sc.nextInt();
		}
	}		
	sc.close();

/*answer*/
	for(i = 0;i < N;i++){
		if(a[i][0] * a[i][0] + a[i][1] * a[i][1] == a[i][2] * a[i][2]){
			System.out.println("YES");
		}else if(a[i][0] * a[i][0] + a[i][2] * a[i][2] == a[i][1] * a[i][1]){
			System.out.println("YES");
		}else if(a[i][2] * a[i][2] + a[i][1] * a[i][1] == a[i][0] * a[i][0]){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}

	}

	}
	public static void main(String[] args){
		(new Main()).run(System.in,System.out);
	}
}