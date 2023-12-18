import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Heap heap = new Heap(3000000);
        while(in.hasNext()){
            String input = in.nextLine();
            if(input.equals("end")) {
            	break;
            }
            if(input.equals("extract")){
                int print = heap.extract();
                System.out.println(print);
            }
            else {
                String[] find = input.split(" ");
                int num = Integer.parseInt(find[1]);
                heap.insert(num);
            }
        }
    }

}

class Heap {
    private int[] Heap;
    private int csize;
    private int size;

    public Heap(int size)
    {
        this.size = size;
        this.csize = 0;
        Heap = new int[this.size + 1];
        Heap[0] = Integer.MAX_VALUE;
    }

    private int parent(int posi) {
        return posi / 2;
    }

    private int left(int posi) {
        return (2 * posi);
    }

    private int right(int posi) {
        return (2 * posi) + 1;
    }

    private boolean leaf(int posi) {
        if (posi > (csize / 2) && posi < csize) {
            return true;
        }
        return false;
    }

    private void swap(int a, int b)  {
        int temp;
        temp = Heap[a];
        Heap[a] = Heap[b];
        Heap[b] = temp;
    }

    private void maxHeapify(int posi) {
        if (leaf(posi)) {
            return;
        }
        if (Heap[posi] < Heap[left(posi)] || Heap[posi] < Heap[right(posi)]) {

            if (Heap[left(posi)] > Heap[right(posi)]) {
                swap(posi, left(posi));
                maxHeapify(left(posi));
            }
            else {
                swap(posi, right(posi));
                maxHeapify(right(posi));
            }
        }
    }

    public void insert(int element) {
        Heap[++csize] = element;
        int current = csize;
        while (Heap[current] > Heap[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    public int extract() {
        int extracted = Heap[1];
        Heap[1] = Heap[csize--];
        Heap[csize+1] = 0;
        maxHeapify(1);
        return extracted;
    }
}
