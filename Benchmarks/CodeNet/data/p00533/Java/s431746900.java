import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int work;
		int[][] r;
		r = new int[h][w];
		
		for(int i=0; i<h; i++){
			char[] weather = sc.next().toCharArray();
			work = -1;
			for(int j=0; j<w; j++){
				if(weather[j] == 'c') work = 0;
				r[i][j] = work;
				if(work>=0) work++;
			}
		}
		
		for(int i=0; i<h; i++){
			for(int j=0; j<w; j++){
				System.out.print(r[i][j]);
				if(j<w-1) System.out.print(" ");
				else System.out.println();
			}
		}
	}

}