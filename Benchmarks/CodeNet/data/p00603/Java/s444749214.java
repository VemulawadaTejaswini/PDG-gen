import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			int r = scan.nextInt();
			int[] card = new int[n];
			for(int i = 0;i < n;i++){
				card[i] = i;
			}
			for(int i = 0;i < r;i++){
				riffleShuffle(card,n,scan.nextInt());
			}
			System.out.println(card[n-1]);
		}
	}
	public static void riffleShuffle(int[] card,int n,int c){
		int m = n/2;
		int[] deckA = new int[n-m];
		int[] deckB = new int[m];
		for(int i = 0;i < deckA.length;i++){
			deckA[i] = card[m+i];
		}
		for(int i = 0;i < m;i++){
			deckB[i] = card[i];
		}
		int count = 0;
		int i = 0;
		for(i = 0;i < c && i < n-m;i++){
			card[count++] = deckA[i];
		}
		int j = 0;
		for(j = 0;j < c && j < m;j++){
			card[count++] = deckB[j];
		}
		if(i < n-m){
			for(;i < n-m;i++){
				card[count++] = deckA[i];
			}
		}
		if(j < m){
			for(;j < m;j++){
				card[count++] = deckB[j];
			}
		}
	}
}