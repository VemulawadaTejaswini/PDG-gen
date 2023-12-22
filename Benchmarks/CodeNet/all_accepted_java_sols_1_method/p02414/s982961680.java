import java.util.Scanner;
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int l = sc.nextInt();
        int[][] a = new int[n][m];
        int[][] b = new int[m][l];
        long[][] c = new long[n][l];
        for(int i=0; i<n; i++) {
        		for(int j=0; j<m; j++) {
        			a[i][j] = sc.nextInt();
        		}
        }
        for(int i=0; i<m; i++) {
    			for(int j=0; j<l; j++) {
    				b[i][j] = sc.nextInt();
    			}
        }
        for(int i=0; i<n; i++) {
        		for(int k=0; k<l; k++) {
        			for(int j=0; j<m; j++) {
        				c[i][k] += a[i][j]*b[j][k];
        			}
        		}
        }
        for(int i=0; i<n; i++) {
        		for(int k=0; k<l; k++) {
        			if(k==l-1) {
        				System.out.println(c[i][k]);
        			} else {
        				System.out.print(c[i][k] + " ");
        			}
        		}
        }
    }
}

