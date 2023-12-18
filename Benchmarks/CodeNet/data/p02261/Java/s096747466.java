import java.util.*;

public class Main{
	final static int MOD = 1000000007;
	final static int INF = 1000000000;
	
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int[] a = new int[n];
		Card[] A1 = new Card[n], A2 = new Card[n];
		for(int i = 0; i < n; ++i){
			String s = sc.next();
			A1[i] = new Card();
			A1[i].suit = s.charAt(0);
			A1[i].num = (s.charAt(1) - '0');
			A2[i] = new Card();
			A2[i].suit = A1[i].suit;
			A2[i].num = A1[i].num;
			}
		sc.close();
		bubbleSort(A1);
		selectionSort(A2);
		printCards(A1);
		System.out.println("Stable");
		printCards(A2);
		System.out.println((isStable(A1, A2) ?"Stable" : "Not stable"));
	}
	
	public static void printCards(Card[] a){
		int n = a.length;
		for(int i = 0; i < n; ++i){
			if(i != 0) System.out.print(" ");
			System.out.printf("%c%d", a[i].suit, a[i].num);
		}
		System.out.println();
	}
	
	public static void bubbleSort(Card[] a){
		int n = a.length;
		boolean flag = true;
		for(int i = 0; flag && (i < n); ++i){
			flag = false;
			for(int j = n-1; j > i; --j){
				if(a[j-1].num > a[j].num){
					{//swap(a[j-1], a[j]の代わり
						Card temp = a[j-1];
						a[j-1] = a[j];
						a[j] = temp;
					}
					flag = true;
				}
			}
		}
	}
	
	public static void selectionSort(Card[] a){
		int n = a.length;
		for(int i = 0; i < n; ++i){
			int minidx = i;
			for(int j = i; j < n; ++j){
				if(a[j].num < a[minidx].num) minidx = j;
			}
			if(i != minidx){
				{//swap(a[i], a[minidx])
					Card temp = a[i];
					a[i] = a[minidx];
					a[minidx] = temp;
				}
			}
		}
	}
	
	public static boolean isStable(Card[] a, Card[] b){
		//a.bはソート済み。aは安定、bを調べる。個数は同じ
		int n = a.length;
		for(int i = 0; i < n; ++i){
	        if(a[i].suit != b[i].suit) return false;
	    }
	    return true;
	}
	
	static class Card{
		char suit; int num;
	}
}
