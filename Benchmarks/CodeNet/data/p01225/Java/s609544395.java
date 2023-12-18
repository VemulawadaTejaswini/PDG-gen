import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] n = new int[9];
		int[] red = new int[9];
		int[] blue = new int[9];
		int[] green = new int[9];
		int r, g, b;
		int[][] R = new int[10][10];
		int[][] G = new int[10][10];
		int[][] B = new int[10][10];
		int[] numR = new int[10];
		int[] numG = new int[10];
		int[] numB = new int[10];
		char c;
		int count;
		int t = sc.nextInt();
		for(int k = 0; k < t; k++){
			r = 0;
			g = 0;
			b = 0;
			for(int i = 1; i <= 9; i++){
				numR[i] = 0;
				numG[i] = 0;
				numB[i] = 0;
			}
			count = 0;
			for(int i = 0; i < 9; i++)
				n[i] = sc.nextInt();
			for(int i = 0; i < 9; i++){
				c = sc.next().charAt(0);
				switch(c){
				case 'R':
					red[r] = n[i];
					r++;
					break;
				case 'G':
					green[g] = n[i];
					g++;
					break;
				case 'B':
					blue[b] = n[i];
					b++;
					break;
				default:
					System.out.println("Error");
					i = -1;
					break;
				}
			}
			sort(R, numR, red, r);
			sort(G, numG, green, g);
			sort(B, numB, blue, b);
			count += set(R, numR) + set(G, numG) + set(B, numB);			
			System.out.println(count == 3 ? 1 : 0);
		}
	}
	static void sort(int[][] C, int[] numC, int[] color, int c){
		for(int i = 0; i < c; i++){
			for(int j = 1; j <= 9; j++)
				if(color[i] == j){
					C[j][++numC[j]] = 1;
			}
		}
	}
	static int set(int[][] C, int[] numC){
		int count = 0;
		for(int i = 1; i <= 9; i++){
			for(int k = 0; k < 3; k++){
				if(numC[i] >= 3){
					numC[i] -= 3;
					count++;
				}else
					break;
			}
			for(int j = numC[i]+1; j <= 9; j++)
				C[i][j] = 0;
		}
		for(int i = 1; i <= 7; i++){
			if(C[i][1] == 1 && C[i+1][1] == 1 && C[i+2][1] == 1){
				count++;
				C[i][1] = C[i][2];
				C[i+1][1] = C[i+1][2];
				C[i+2][1] = C[i+2][2];
				i = 0;
			}
		}
		return count;
	}
}