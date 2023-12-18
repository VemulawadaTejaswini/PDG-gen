import java.util.Scanner;
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] a = new int[r+1][c+1];
        for(int i=0; i<r; i++) {
        		int x = 0;
        		for(int j=0; j<c; j++) {
        			a[i][j] = sc.nextInt();
        			x += a[i][j];
        			a[r][j] += a[i][j];
        			if(j==c-1) {
        				a[i][c] = x; 
        				a[r][c] += x;
        			}
        		}
        }
        for(int i=0; i<r+1; i++) {
        		for(int j=0; j<c+1; j++) {
        			if(j==c) {
        				System.out.println(a[i][j]);
        			} else {
        				System.out.print(a[i][j] + " ");
        			}
        		}
        }
    }
}
