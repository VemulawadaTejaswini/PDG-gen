import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int[] p = new int[3];
		int[] j = new int[2];
		int minp = 2000,minj = 2000;
		
		for(int i = 0; i < 3; i++){
			p[i] = sc.nextInt();
			minp = Math.min(minp, p[i]);
		}
		
		for(int i = 0; i < 2; i++){
			j[i] = sc.nextInt();
			minj = Math.min(minj, j[i]);
		}
			
			System.out.println(minp + minj - 50);
			
			sc.close();
	}
}