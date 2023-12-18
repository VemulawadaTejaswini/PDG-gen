
import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

class Card {
	String s;
	int value;
	Card (String s, int value) {
		this.s = s;
		this.value = value;
	}
}

public class Main {

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		int n = Integer.parseInt(in.readLine());


		Card[] a = new Card[n];
		Card[] b = new Card[n];
		for(int i = 0; i < n; i++) {
			String[] tmp = in.readLine().split(" ");
			a[i]= new Card(tmp[0],Integer.parseInt(tmp[1]));
			b[i]= new Card(tmp[0],Integer.parseInt(tmp[1]));
		}
		
		mergeSort(b, 0, n);
		quickSort(a, 0, n-1);
		
		boolean stable = true;
		for(int i = 0; i < n; i++) {
			if(!a[i].s.equals(b[i].s)) {
				stable = false;
			}
		}
		if(stable) {
			System.out.println("Stable");
		} else {
			System.out.println("Not stable");
		}
		for(int i = 0; i < n; i++) {
			System.out.println(a[i].s + " " + a[i].value);
		}
		


	}
	static void quickSort(Card[] a, int p, int r) {
		if(p <= r) {
			int pivot = partition(a,p,r);
			quickSort(a,p,pivot-1);
			quickSort(a,pivot+1,r);
		}
	}
	static int partition(Card[] a, int p, int r) {
		int i = p-1;
		int x = a[r].value;
		
		for(int j = p; j < r; j++) {
			if(a[j].value <= x) {
				i++;
				Card tmp = a[i];
				a[i] = a[j];
				a[j] = tmp;
			}
		}
		Card tmp = a[i+1];
		a[i+1] = a[r];
		a[r] = tmp;
		return i + 1;
	}
	
	static void mergeSort(Card[] a, int left, int right) {
		if(left + 1 < right) {
			int mid = (left + right) / 2;
			mergeSort(a, left, mid);
			mergeSort(a, mid, right);
			merge(a, left, mid, right);
		}
	}
	static void merge(Card[] a, int left, int mid, int right) {
		int n1 = mid-left;
		int n2 = right-mid;
		
		Card[] b = new Card[n1+1];
		for(int i = 0; i <n1; i++) {
			b[i] = a[left + i];
		}		
		b[n1] = new Card(null, Integer.MAX_VALUE);
		Card[] c = new Card[n2+1];
		for(int i = 0; i <n2; i++) {
			c[i] = a[mid + i];
		}
		c[n2] = new Card(null, Integer.MAX_VALUE);
		
		int i = 0, j = 0;
		for (int k = left; k < right; k++) {
			if(b[i].value <= c[j].value) {
				a[k] = b[i];
				i++;
			} else {
				a[k] = c[j];
				j++;
			}
			
		}
	}
	
}
