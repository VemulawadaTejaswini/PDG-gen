import java.util.*;
public class Main {
	public static void main(String[] a){
		Scanner scan = new Scanner(System.in);
		int [] rank = new int[10];
		int space;
	

		for(int i=0;i<rank.length;i++){
			rank[i] = scan.nextInt();
		}
		
		for(int k = 0;k<rank.length;k++){
			for(int j = 0;j<rank.length;j++){
				if(rank[k]>rank[j]){
					space = rank[k];
					rank[k] = rank[j];
					rank[j] = space;
				}
			}
		}
		for(int j = 0;j<3;j++){
			System.out.println(rank[j]);
		}
		
	}
}