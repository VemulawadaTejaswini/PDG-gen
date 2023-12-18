import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		MyHeap heaponga = new MyHeap(1001000);
		String input;
		while (in.hasNext()) {
			input = in.nextLine();
			// Checamos para entrada do tipo "insert"
			if (input.charAt(0) == 'i') {
				String[] number = input.split(" ");
				heaponga.insert(Integer.parseInt(number[1]));
			}
			// Checamos para entrada do tipo "extract"
			else if (input.charAt(1) == 'x') {
				heaponga.remove();
			} else {
				// Caso do "end"
				break;
			}
		}

	}
}

class MyHeap {
	private int[] heap;
	private int lastIndex;

	public MyHeap(int heapSize) {
		heap = new int[heapSize]; // Usarei Integer ao inves de int para lidar com o problema do elemento ser
										// igual a 0
		lastIndex = 0;
	}

	public void insert(int element) {
		// Insere primeiramente o elemento na ultima posicao livre do array
		heap[lastIndex] = element;
		int aux = lastIndex;
		lastIndex++;
		// Agr vamos corrigir o possivel erro causado na insercao, a partir do novo
		// elemento ate a raiz da heap (mantendo ela uma max heap)
		while (heap[aux] > heap[parent(aux)]) {
			switchPositions(aux, parent(aux));
			aux = parent(aux);
		}
	}

	public void remove() {
		// Trocamos o primeiro com o ultimo elemento e salvamos o item que iremos
		// remover em uma variavel auxiliar e atualizamos o ultimo elemento
		int aux = heap[0];
		switchPositions(0, lastIndex - 1);
		lastIndex--;
		// Agr necessitamos corrigir a heap para mante-la seguindo sua propriedade de
		// ordem (dar um heapify ou bubble up)
		heapify(0);
		System.out.println(aux);
	}

	public int parent(int position) {
		// Funcao simples para retornar a raiz de um determinado elemento
		return (position / 2);
	}

	public void switchPositions(int posA, int posB) {
		// Funcao simples que troca a posicao de dois elementos dentro do array
		int aux = heap[posA];
		heap[posA] = heap[posB];
		heap[posB] = aux;
	}

	public boolean leaf(int index) {
		// Funcao simples que checa se o elemento em questao eh uma folha ou nao
		if (index >= (lastIndex / 2) && index <= lastIndex)
			return true;
		else
			return false;

	}

	public void heapify(int index) {
		// Primeiramente devemos checar se estamos em uma folha, pois devemos para se
		// for o caso
		if (leaf(index)) {
			return;
		}
		// Agr devemos checar nas subheaps a direita e esquerda, consertando-as de forma
		// recursiva
		if (heap[index] < heap[(2 * index) + 1] || heap[index] < heap[2 * index]) {
			if (heap[2 * index] > heap[(2 * index) + 1]) {
				switchPositions(index, 2 * index);
				heapify(2 * index);
			} else {
				switchPositions(index, (2 * index) + 1);
				heapify((2 * index) + 1);
			}
		}
	}
}

