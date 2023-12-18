import java.util.Scanner;


public class Main{
    public  static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        	int H = sc.nextInt();
        	int W = sc.nextInt();
        	int[][] cicada=new int[H+1][W+1];
        	for(int i=0; i<H; i++) {
        		for(int j=0; j<W; j++) {
        			cicada[i][j]=sc.nextInt();
        		}
        	}
        	for(int i=0; i<H; i++) {
        		for(int j=0; j<W; j++) {
        			if(i==0 && j==0) {
        				cicada[i][j]=0;
        			}
        			else if(i==0) {
        				cicada[i][j]=cicada[i][j-1];
        			}
        			else if(j==0) {
        				cicada[i][j]=cicada[i-1][j];
        			}
        			else {
        				cicada[i][j]=Math.min(cicada[i-1][j], cicada[i][j-1]);
        			}
        		}
        	}
        	System.out.println(cicada[H-1][W-1]);
        }
    }
}
