import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Heap heap = new Heap();
        int i =0, k;
        String[] actions;
        String action= "";
        while(!(action= in.nextLine()).equals("end")){
            actions = action.split(" ");
            action = actions[0];
            if(action.equals("insert")){
                k = Integer.parseInt(actions[1]);
                heap.insert(k);
            }
            else{
                System.out.println(heap.extract());
            }
        }
    }
}
class Heap {
    private int[] heap;
    private int i;
    Heap(){
        this.heap = new int[2000001];
        this.i =0;
    }
    public void insert(int k){
        this.i++;
        this.heap[this.i]=k;
        int pos = i;
        while(pos>1 && heap[pos]>heap[pos/2]){
            int temp = heap[pos];
            heap[pos] = heap[pos/2];
            heap[pos/2] = temp;
            pos /= 2;
        }
        //System.out.println(i+" "+heap[i]);
    }
    public int extract(){
        int answ;
        if(this.i==1){
            answ = this.heap[1];
            this.i--;
            //System.out.println(i);
        }
        else {
            /*for(int i=1;i<=this.i;i++){
                System.out.print(heap[i]+" ");
            }
            System.out.println("");*/
            /*for(int i=1;i<=this.i;i++){
                System.out.print(heap[i]+" ");
            }
            System.out.println("");*/
            answ = this.heap[1];
            this.heap[1] = this.heap[(this.i)];
            this.i--;
            /*for(int i=1;i<=this.i+1;i++){
                System.out.print(heap[i]+" ");
            }
            System.out.println("");*/
            heapfy();
            /*for(int i=1;i<=this.i+1;i++){
                System.out.print(heap[i]+" ");
            }
            System.out.println("");*/
        }
        return answ;
    }
    private void heapfy(){
        int n = this.i, v, j, k;
        for(int i = n/2;i>=1;i--){
            boolean heap=false;
            v = this.heap[i];
            k = i;
            while (!heap && 2*k<=n){
                j = 2 *k;
                if(j<n && this.heap[j]<this.heap[j+1]){
                    j++;
                }
                if(v>=this.heap[j]){
                    heap = true;
                }
                else{
                    this.heap[k] = this.heap[j];
                    k = j;
                }
            }
            this.heap[k] = v;
        }
    }
}
