import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			int c = scan.nextInt();
			int[] deck = new int[n];
			for(int i = 0;i < n;i++){
				deck[i] = i;
			}
			for(int i = 0;i < c;i++){
				riffleShuffle(deck,n,scan.nextInt());
			}
			System.out.println(deck[deck.length-1]);
		}
	}
	public static void riffleShuffle(int[] deck,int n,int m){
		int hN = n/2;
		int[] b = new int[hN];
		int[] a = new int[n-hN];
		for(int i = 0;i < n-hN;i++){
			a[i] = deck[i+hN];
		}
		for(int i = 0;i < hN;i++){
			b[i] = deck[i];
		}
		int pos = 0;
		for(int i = 0;i < m && i < n-hN;i++){
			deck[pos++] = a[i];
		}
		for(int i = 0;i < m && i < hN;i++){
			deck[pos++] = b[i];
		}
		for(int i = m;i < n-hN;i++,pos++){
			deck[pos] = a[i];
		}
		for(int i = m;i < hN;i++,pos++){
			deck[pos] = b[i];
		}
	}
}