
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Heap heap = new Heap();

        while (true){
            String action = in.next();
            int num = 0;
            if(action.equals("insert")){
                num = in.nextInt();
            }


            if(action.equals("insert")){
                heap.insert(num);
            } else if(action.equals("extract")){
                int popped = heap.extractMax();
                System.out.println(popped);
            } else{
                break;
            }
        }
    }
}

class Heap {
    private int [] heap;
    private int size;
    public Heap(){
        heap = new int[2000001];
        size = 0;
    }

    private int parent(int pos){
        if(pos == 1){
            return 1;
        }
        return pos/2;
    }

    private int leftChild(int pos){
            return (pos * 2);
    }

    private int rightChild(int pos){
        return (pos * 2)+1;
    }

    private boolean isLeaf(int pos) {
        if (pos>1 && pos >= (size / 2) && heap[pos*2] == 0 && heap[(pos*2)+1]==0) {
            return true;
        }
        return false;
    }
    //ta funcionando
    private void swap(int fpos, int spos){
        int tmp;
        tmp = this.heap[fpos];
        this.heap[fpos] = this.heap[spos];
        this.heap[spos] = tmp;

    }

    private void maxHeapify(int pos){
        if(heap[pos*2]!=0 && heap[(pos*2)+1]!=0) {
            if (heap[pos] < heap[leftChild(pos)] || heap[pos] < heap[rightChild(pos)]) {
                if (heap[leftChild(pos)] > heap[rightChild(pos)]) {
                    swap(pos, leftChild(pos));
                    maxHeapify(leftChild(pos));
                } else {
                    swap(pos, rightChild(pos));
                    maxHeapify(rightChild(pos));
                }
            }
        }
        return;
    }

    public void insert(int k){

        heap[size+1] = k;
        size++;

        int current = size;


        while (current>1 && heap[current]>heap[parent(current)]){
            swap(current, parent(current));
            current = parent(current);
        }


    }

    public int extractMax(){
        int popped = heap[1];
        heap[1] = heap[size];
        heap[size] = 0;
        size--;
        /*
        for (int i = 1; i <= size / 2; ) {
            if (heap[i * 2] > heap[(i * 2) + 1]) {
                if (heap[i] < heap[i * 2]) {
                    int aux3;
                    aux3 = heap[i];
                    heap[i] = heap[i * 2];
                    heap[i * 2] = aux3;
                    i = i * 2;
                } else {
                    break;
                }
            } else {
                if (heap[i] < heap[(i * 2) + 1]) {
                    int aux4;
                    aux4 = heap[i];
                    heap[i] = heap[(i * 2) + 1];
                    heap[(i * 2) + 1] = aux4;
                    i = (i * 2) + 1;
                } else {
                    break;
                }
            }
        }
*/
        maxHeapify(1);
        return popped;
    }
}
