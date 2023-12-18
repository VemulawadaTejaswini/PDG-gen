import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        String input = "hooray!";
        HeapQ prior = new HeapQ();

        while(!(input.equals("end"))){

            input = in.nextLine();

            if(input.startsWith("i")){
                String[] operations = input.split(" ");
                prior.givePriority(Integer.parseInt(operations[1]));
                prior.heapify();
//                int[] print = prior.getQueue();
//                System.out.printf("[");
//                for(int i = 0; i < print.length; i++){
//                    System.out.printf("%d,", print[i]);
//                }
//                System.out.printf("]\n");
            }

            else if(input.equals("extract")){
                System.out.printf("%d\n",prior.extract());
                prior.heapify();

//                int[] print = prior.getQueue();
//                System.out.printf("[");
//                for(int i = 0; i < print.length; i++){
//                    System.out.printf("%d,", print[i]);
//                }
//                System.out.printf("]\n");
            }

        }


        in.close();

    }
}

class HeapQ {

    private int[] queue;
    private int size;
    private int splitPoint;


    HeapQ() {
        this.queue = new int[2000001];
        this.size = 1;
        this.splitPoint = 0;
    }

    public void givePriority(int toIns){
        this.queue[size] = toIns;
        this.size++;
    }

    public void heapify() {
        for (int i = 1; i < Math.abs(queue.length / 2); i++) {
            this.splitPoint = i;
            int v = this.queue[splitPoint];
            boolean heap = false;

            while (!heap && 2 * splitPoint <= this.queue.length) {
                int j = 2 * splitPoint;

                if(j < this.queue.length){
                    if(queue[j] < queue[j+1]){
                        j = j + 1;
                    }
                }
                if(v >= queue[j]){
                    heap = true;
                }
                else{
                    queue[splitPoint] = queue[j];
                    splitPoint = j;
                }
            }
            queue[splitPoint] = v;

        }
    }

    public int extract(){
        int something;
        something = this.queue[1];
        for(int i = 1; i < size + 1; i++){
            queue[i] = queue[i+1];
        }
        this.size--;
        return something;
    }

    public int[] getQueue(){
        int[] toReturn = new int[size - 1];
        for(int i = 0; i < size - 1; i++){
            toReturn[i] = queue[i + 1];
        }
        return toReturn;
    }
}
