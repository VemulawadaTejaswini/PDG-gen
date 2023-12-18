import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        String input = "hooray!";
        HeapQ prior = new HeapQ();

        while(!(input.equals("end"))){
            input = in.next();

            if(input.startsWith("i")){
                input = in.next();
                prior.givePriority(Integer.parseInt(input));

            }

            else if(input.equals("extract")){
                prior.heapify();
                System.out.printf("%d\n",prior.extract());
                prior.heapify();
            }

        }


        in.close();

    }
}

class HeapQ {

    private int[] queue;
    private int size;


    HeapQ() {
        this.queue = new int[2000080];
        this.size = 1;
    }

    public void givePriority(int toIns){
        this.queue[size] = toIns;
        this.size++;
    }

    public void heapify() {
        for (int  i = (this.size/2); i >= 1; i /=2) {
            int k = i;
            int v = this.queue[k];
            boolean heap = false;

            while (!heap && ( (2 * k) <= this.queue.length) ) {
                int j = 2 * k;

                if(j <= this.queue.length){
                    if(queue[j] < queue[j + 1]){
                        j = j + 1;
                    }
                }
                if(v >= queue[j]){
                    heap = true;
                }
                else{
                    queue[k] = queue[j];
                    k = j;
                }
            }
            queue[k] = v;

        }
    }

    public int extract(){
        int something;
        something = this.queue[1];

        for(int i = 1; i < size + 1; i++){
            queue[i] = queue[i+1];
        }
        if(this.size > 1) {
            this.size--;
        }
        return something;
    }
}
