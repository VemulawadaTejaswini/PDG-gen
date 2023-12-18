import java.util.Scanner;
	class MaxHeap { 
	    private int[] Heap; 
	    private int size; 
	    private int maxsize; 
	  
	    // Construtor para inicializar uma MaxHeap vazia 
	    public MaxHeap(int maxsize) 
	    { 
	        this.maxsize = maxsize; 
	        this.size = 0; 
	        Heap = new int[this.maxsize + 1]; 
	        Heap[0] = 10000; 
	    } 
	  
	    // Posição do pai
	    private int parent(int pos) 
	    { 
	        return pos / 2; 
	    } 
	  
	   //Posicao dos filhos. 
	    private int leftChild(int pos) 
	    { 
	        return (2 * pos); 
	    } 
	    private int rightChild(int pos) 
	    { 
	        return (2 * pos) + 1; 
	    } 
	  
	    private void swap(int pos1, int pos2) 
	    { 
	        int hold; 
	        hold = Heap[pos1]; 
	        Heap[pos1] = Heap[pos2]; 
	        Heap[pos2] = hold; 
	    } 
	  
	    // Função recursiva Heapify para manter a maxHeap
	    private void heapify(int pos) 
	    { 
	    	if (pos >= (size / 2) && pos <= size) //determina se é uma folha
	            return; 
	  
	        if (Heap[pos] < Heap[leftChild(pos)] ||  
	            Heap[pos] < Heap[rightChild(pos)]) { 
	  
	            if (Heap[leftChild(pos)] > Heap[rightChild(pos)]) { 
	                swap(pos, leftChild(pos)); 
	                heapify(leftChild(pos)); 
	            } 
	            else { 
	                swap(pos, rightChild(pos)); 
	                heapify(rightChild(pos)); 
	            } 
	        } 
	    } 
	  
	    // Insere novo elemento na MaxHeap
	    public void insert(int element) 
	    { 
	        Heap[++size] = element; 
	        int current = size; 
	        while (Heap[current] > Heap[parent(current)]) { 
	            swap(current, parent(current)); 
	            current = parent(current); 
	        } 
	    } 
	    
	    // Remove elemento da maxheap 
	    public int extract() 
	    { 
	        int extracted = Heap[1]; 
	        Heap[1] = Heap[size--]; 
	        heapify(1); 
	        return extracted; 
	    } 
	  
	  
	    public static void main(String[] arg) 
	    { 
	    	Scanner input = new Scanner(System.in);
	        MaxHeap priorityQueue = new MaxHeap(99);
	        String enter = "";
	        while (!(enter.equals("end"))) {
	        	enter = input.nextLine();
	        	String arr[] = enter.split(" ");
	        	if (arr[0].equals("insert")) {
	        		int number = Integer.parseInt(arr[1]);
	        		priorityQueue.insert(number);
	        	}
	        	else if (arr[0].equals("extract")) {
	        		System.out.println(priorityQueue.extract());
	        	}
	        } 
	    } 
	}
