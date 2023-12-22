import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		FastScanner fs=new FastScanner();
		int d = fs.nextInt();
		int t = fs.nextInt();
		int s = fs.nextInt();
		
		if((float)d/s<=t) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
	}
	
	

	static final Random random=new Random();
	
	static void ruffleSort(int[] a) {
		int n=a.length;//shuffle, then sort 
		for (int i=0; i<n; i++) {
			int oi=random.nextInt(n), temp=a[oi];
			a[oi]=a[i]; a[i]=temp;
		}
		Arrays.sort(a);
	}
	
	static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		String next() {
			while (!st.hasMoreTokens())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}
		
		int nextInt() {
			return Integer.parseInt(next());
		}
		int[] readArray(int n) {
			int[] a=new int[n];
			for (int i=0; i<n; i++) a[i]=nextInt();
			return a;
		}
		long nextLong() {
			return Long.parseLong(next());
		}
	}

	
}


class node{
	int data;
	node next;

	node(int data){
		this.data=data;
	}
}

class Methods{
	node head;
	int size =0 ;
	void insert(int data) {
		node n = new node(data);
		size++;
		if(head==null) {
			head= n;
		}
		else {
			node k = head;
			while(k.next!=null) {
				k=k.next;
			}
			
			k.next=n;
		}
		
	}

	void print() {
		node n = head;
		while(n.next!=null) {
			System.out.print(n.data+" ");
			n=n.next;
		}
		System.out.println(n.data);
		
	}
	
	void isLoop(int x) {
		
		System.out.println(size - x +1);
		
		node n = head;
		
		while(n.next!=null && x-->2 ) {
			n=n.next;
		}
		
		n.next=n.next.next;
		
	}
	
	
}


