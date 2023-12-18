import java.util.*;

public class meh {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Heap heap = new Heap(2000001);
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

    private void swap(int a, int b)  {
        int temp;
        temp = Heap[a];
        Heap[a] = Heap[b];
        Heap[b] = temp;
    }

    private void maxHeapify() {
        int i = 1,j; 
        int n=this.csize;
        boolean isHeap = false;
        while(!isHeap && i<=n/2) {
            j= i*2;
            if(j<n && Heap[j+1]>Heap[j]) j++;
            if(Heap[j]>Heap[i]){
               swap(i,j);
               i = j;
            }
            else {
                isHeap=true;
            }
        }
    }

    public void insert(int element) {
        Heap[++csize] = element;
        int current = csize;
        while (current>1 && Heap[current] > Heap[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    public int extract() {
        int extracted = Heap[1];
        Heap[1] = Heap[csize];
        Heap[csize] = 0;
        csize--;
        maxHeapify();
        return extracted;
    }
}
