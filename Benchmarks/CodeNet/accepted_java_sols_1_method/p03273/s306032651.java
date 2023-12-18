import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int H = scan.nextInt();
		int W = scan.nextInt();
	        scan.nextLine();

		String[] cell = new String[H];
		for(int i = 0 ; i < H ; i++) {
			cell[i] = scan.nextLine();
		}
		
		scan.close();
		
		int[] hCell = new int[H];
 		int[] wCell = new int[W];
		
 		for(int j = 0 ; j < H ; j++) {
 			for(int k = 0 ; k < W ; k++) {
 				if(cell[j].charAt(k) == '#') {
 					hCell[j]++;
 					wCell[k]++;
 				}
 			}
 		}
 		
 		String str;
 		for(int l = 0 ; l < H ; l++) {
 			str = "";
 			if(hCell[l] > 0){
	 			for(int m = 0 ; m < W ; m++) {
	 				if(wCell[m] > 0) {
	 					str = str + cell[l].charAt(m);
	 				}
	 			}
 			}
 			if(str != "") {
 				System.out.println(str);
 			}
 		}
	}
}
