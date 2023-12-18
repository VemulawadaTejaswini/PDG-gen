import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Main{
	private static void selection(String a[]){
		int count=0;
		int mini=0;
		for(int i = 0 ; i < a.length-1 ; i++){
			mini=i;
			for(int j = i+1;j<a.length;j++){
				if((int)a[j].charAt(1)<(int)a[mini].charAt(1)){
					mini=j;			
				}
			}
			if(mini!=i){
				String temp=a[i];
				a[i]=a[mini];
				a[mini]=temp;
				count++;
			}
		}
	}
	private static void bubble(String a[]){
		int count=0;
		for(int i = 0 ; i < a.length-1 ; i++){
			for(int j = a.length-1;j>i;j--){
				if((int)a[j].charAt(1)<(int)a[j-1].charAt(1)){
					String temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
					count++;
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();		
		String[] card = new String[N];
		for(int i = 0 ; i < N ; i ++){
			card[i]=scan.next();
		}
		String[] cardC = card.clone();
		bubble(card);
		selection(cardC);
		for(int i = 0 ; i < N ; i ++){
			System.out.print((i+1==N)?card[i]:card[i]+" ");
		}
		System.out.println("");
		System.out.println("Stable");
		for(int i = 0 ; i < N ; i ++){
			System.out.print((i+1==N)?cardC[i]:cardC[i]+" ");
		}
		System.out.println("");
		System.out.println((Arrays.equals(card, cardC))?"Stable":"Not stable");
	}	
}