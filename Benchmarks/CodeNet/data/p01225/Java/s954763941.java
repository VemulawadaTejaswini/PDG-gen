import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] n = new int[9];
		int[] nr = new int[9];
		int[] ng = new int[9];
		int[] nb = new int[9];
		int ir;
		int ig;
		int ib;
		int count;
		char c;
		int t = sc.nextInt();
		for(int i = 0; i < t; i++){
			ir = 0;
			ig = 0;
			ib = 0;
			count = 0;
			for(int j = 0; j < 9; j++)
				n[j] = sc.nextInt();
			for(int j = 0; j < 9; j++){
				c = sc.next().charAt(0);
				switch(c){
				case 'R':
					nr[ir] = n[j];
					ir++;
					break;
				case 'G':
					ng[ig] = n[j];
					ig++;
					break;
				case 'B':
					nb[ib] = n[j];
					ib++;
					break;
				default:
					System.out.println("Error");
					j = -1;
					break;
				}
			}
			sort(nr, ir);
			sort(ng, ig);
			sort(nb, ib);
			count += count(nr, ir) + count(ng, ig) + count(nb, ib);
			System.out.println(count == 3 ? 1 : 0);
		}
	}
	static void sort(int[] n, int m){
		int temp;
		for(int i = 0; i < m-1; i++){
			for(int j = i+1; j < m; j++){
				if(n[i] > n[j]){
					temp = n[i];
					n[i] = n[j];
					n[j] = temp;
				}
			}
		}
	}
	static int count(int[] n, int m){
		int count = 0;
		for(int i = 0; i < m-2; i++){
			if(n[i] == n[i+1] && n[i+1] == n[i+2]){
				count++;
				i += 2;
			}else if(n[i+2] - n[i+1] == 1 && n[i+1] - n[i] == 1){
				count++;
				i += 2;
			}
		}
		return count;
	}
}