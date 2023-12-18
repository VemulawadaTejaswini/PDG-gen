import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] resposta = new int[2000001];
		int a = 0;
		MaxHeap pq = new MaxHeap(2000001);
		
		String entrada = in.next();
		while (!entrada.equals("end")) {
			if (entrada.equals("insert")) {
				int k = in.nextInt(); // key
				pq.adicionar(k);
			} else if (entrada.equals("extract")) {
				int k = pq.remover();
				resposta[a]= k;
				a++;
			}
			entrada = in.next();
		}
		// imprimindo a saida
		for (int i = 0; i < a; i++) {
			System.out.println(resposta[i]);
		}

	}
	
	//classe heap - priority queue
	static class MaxHeap {
		int[] heap;
		int size, maxsize;

		public MaxHeap(int maxsize) {
			this.maxsize = maxsize;
			this.size = 0;
			heap = new int[this.maxsize];
		}

		private int parent(int pos) {
			return pos/2;
		}

		private int leftChild(int pos) {
			return (2*pos);
		}

		private int rightChild(int pos) {
			return (2*pos)+1;
		}

		private boolean isLeaf(int pos) {
			if (pos>=(size/2) && pos<=size) {
				return true;
			}
			return false;
		}

		private void maxHeapify(int pos) {
			if (!isLeaf(pos)) {
				if (heap[pos]<heap[leftChild(pos)] || heap[pos]<heap[rightChild(pos)]) {
					if (heap[leftChild(pos)]>heap[rightChild(pos)]) {
						swap(pos, leftChild(pos));
						maxHeapify(leftChild(pos));
					} else {
						swap(pos, rightChild(pos));
						maxHeapify(rightChild(pos));
					}
				}
			}
		}

		public void adicionar(int elemento) {
			int i = size;
			int index = parent(i-1);
			while (i>0 && elemento>heap[index]) {
				heap[i] = heap[index];
				i = index;
				index = parent(i);
			}
			heap[i] = elemento;
			size++;
		}

		public int remover() {
			int remover = heap[0];
			heap[0] = heap[--size];
			maxHeapify(0);
			return remover;
		}
		
		private void swap(int primeiro, int segundo) {
			int temporario;
			temporario = heap[primeiro];
			heap[primeiro] = heap[segundo];
			heap[segundo] = temporario;
		}
		
	}
	
}

