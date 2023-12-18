import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = Integer.parseInt(sc.next());
		int w = Integer.parseInt(sc.next());
		int n = Integer.parseInt(sc.next());
		int[] a = new int[n];
		
		for(int i=0; i<n; i++) {
		    a[i] = Integer.parseInt(sc.next());
		}
		
		int[][] c = new int[h][w];
		int nowi = 0;
		int nowj = 0;
		for(int k=0; k<n; k++) {
		    int count = a[k];
		    while(count > 0) {
    	        if(nowi % 2 == 0) {
                    for(int j=nowj; j<w; j++) {
                        if(count == 0) break;
                        c[nowi][nowj] = k+1;
                        count--;
                        nowj++;
                    }
                    if(nowj == w) {nowi++; nowj--;}
                    if(count == 0) break;
    	        }
    	        if(nowi % 2 == 1) {
    	            for(int j=nowj; j>=0; j--) {
                        if(count == 0) break;
                        c[nowi][nowj] = k+1;
                        count--;
                        nowj--;
                    }
                    if(nowj == -1) {nowi++; nowj++;}
                    if(count == 0) break;
    	        }
		    }
		}
		
		for(int i=0; i<h; i++) {
		    for(int j=0; j<w; j++) {
		        System.out.print(c[i][j]+" ");
		    }
		    System.out.println();
		}
		
	}
}