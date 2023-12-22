import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			String nk = sc.nextLine();
			String[] nka = nk.split(" ");
			int n = Integer.parseInt(nka[0]);
			int k = Integer.parseInt(nka[1]);
			if(n == 0 && k == 0) break;
			int[][] all = new int[n+1][k];
			boolean jud = true;
			for(int i = 0 ; i < all.length ; i++){
				String str = sc.nextLine();
				String[] stra = str.split(" ");
				
				for(int j = 0 ; j < stra.length ; j++){
					all[i][j] = Integer.parseInt(stra[j]);
				}
			}
			
			for(int i = 1 ; i < all.length ;i++){
				for(int j = 0 ; j < all[i].length ; j++){
					all[0][j] -= all[i][j];
				}
			}
			for(int i = 0 ; i < all[0].length ;i++){
				if(all[0][i] < 0) jud = false; 
			}
			if(jud){
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
		sc.close();
	}

}