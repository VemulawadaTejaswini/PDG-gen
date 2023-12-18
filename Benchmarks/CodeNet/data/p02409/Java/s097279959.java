import java.util.Scanner;
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][4];
        for (int i=0; i<n; i++) {
        		for(int j=0; j<4; j++) {
        			a[i][j] = sc.nextInt();
        		}
        }
        for (int i=0; i<4; i++) {
        		int[][] b = new int[3][10];
        		for (int j=0; j<n; j++) {
        			if(a[j][0] == i+1
        					) {
        				b[a[j][1]-1][a[j][2]-1] += a[j][3];
        			}
        		}
        		for (int k=0; k<3; k++) {
        			for (int l=0; l<10; l++) {
        				if (l == 9) {
        					System.out.println(" " + b[k][l]);
        				} else {
        					System.out.print(" " + b[k][l]);
        				}
        			}
        		}
        		if (i != 3) System.out.println("####################");
        }
    }
}
