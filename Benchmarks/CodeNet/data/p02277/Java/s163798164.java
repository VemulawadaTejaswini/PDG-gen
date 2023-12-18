import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
	
	static Map<Integer, Card> cardMap = new HashMap<Integer, Card>();
	static Map<Integer, Integer> numMap = new HashMap<Integer, Integer>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] a = new int[n];
		for(int i = 0; i < n; i++){
			String[] str = br.readLine().split(" ");
			Card card = new Card(str[0], Integer.parseInt(str[1]), i);
			cardMap.put(i, card);
			numMap.put(i, card.num);
			a[i] = i;
		}
		quickSort(a, 0, n - 1);
		boolean flag = true;
		
		Card card = cardMap.get(a[0]);
		int num = card.num;
		int order = card.order;
		//System.out.println(card.mark + " " + card.num + " " + card.order);
		for (int i = 1; i < n; i++) {
			int k = a[i];
			card = cardMap.get(k);
			if(num == card.num && card.order < order){
				flag = false;
			}
			num= card.num;
			order = card.order;
			//System.out.println(card.mark + " " + card.num + " " + card.order);
		}
		if(flag == true){
			System.out.println("Stable");
		} else {
			System.out.println("Not stable");
		}
		for (int i = 0; i < n; i++) {
			int k = a[i];
			card = cardMap.get(k);
			if(num == card.num && card.order < order){
				flag = false;
			}
			num= card.num;
			order = card.order;
			System.out.println(card.mark + " " + card.num);
		}
	} 

	static int partition(int[] a, int p, int r) {
		int x = numMap.get(a[r]);
		int i = p - 1;
		int tmp;
		for (int j = p; j < r; j++) {
			if (numMap.get(a[j]) <= x) {
				i = i + 1;
				tmp = a[i];
				a[i] = a[j];
				a[j] = tmp;
			}
		}
		tmp = a[i + 1];
		a[i + 1] = a[r];
		a[r] = tmp;
		return i + 1;
	}
	static void quickSort(int[] a, int p, int r){
		int q = 0;
		if(p < r){
			q = partition(a, p, r);
			quickSort(a, p, q-1);
			quickSort(a, q+1, r);
		} else {
			return;
		}
	}
}
//??????????????????????????????????????????
class Card{
	
	String mark;
	int num;
	int order;
	
	Card(String mark, int num, int order){
		this.mark = mark;
		this.num = num;
		this.order = order;
	}
}