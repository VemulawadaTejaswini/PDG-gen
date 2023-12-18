import java.util.*;
public class Main {
	public static void main(String[] a){
		Scanner scan = new Scanner(System.in);
		int [] rank = new int[4];
		int space;
		int mountain_hi;
		
		mountain_hi = scan.nextInt();
		rank[0] = mountain_hi;
		for(int i=1;i<10;i++ ){
			mountain_hi = scan.nextInt();
			for(int l =0;l<rank.length-1;l++){
				if(rank[l]<mountain_hi){
					space = rank[l];
					rank[l] = mountain_hi;
					rank[l+1] = space;
					break;
				}
			}
		}
		for(int j = 0;j<3;j++){
			System.out.println(rank[j]);
		}
		
	}
}