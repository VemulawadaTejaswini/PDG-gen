import java.util.Scanner;

class Main {
	
	static int[][] multi;
	static int[] line;
	static int[] col;
	
	static int rec (int m, int n) {
		if(m ==n)
            return 0;
        if(multi[m][n] == 0){
            int min = Integer.MAX_VALUE;
            for(int i = m; i < n; i++){
                int r = rec(m, i) + rec (i + 1, n) + (line[m] * col[i] * col[n]);
                if(r < min)
                    min = r;
            }
            multi[m][n] = min;
        }
        return multi[m][n];
	}

	public static void main (String[] args) {
		Scanner scan = new Scanner (System.in);
		int n = scan.nextInt();
		multi = new int[n][n];
		line = new int[n];
		col = new int[n];
		
		
		for (int i = 0; i < n; i++) {
			line[i] = scan.nextInt();
			col[i] = scan.nextInt();
		}
		scan.close();
		System.out.println(rec(0, n - 1));
	}
}

