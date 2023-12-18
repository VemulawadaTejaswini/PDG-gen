
class Main {
    
    public static void main(String args[]) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        PriorityQueue priorityQueue = new PriorityQueue();
        boolean isContinue = true;;
        while(isContinue){
           String order = sc.next();
           switch (order){
                case "insert":
                    priorityQueue.insert(Integer.parseInt(sc.next()));
                    break;
                case "extract":
                    priorityQueue.extract();
                    break;
                case "end":
                    isContinue = false;
                    break;
            default:
                System.out.println("unsupported error");
                break;
           }
            
        }
        sc.close();
    }
    static class PriorityQueue{
        static private final int MAX_ELEMENT = 2000000; 
        private int[] A = new int[MAX_ELEMENT+1];
        private int elemrntNum = 0;

        public void insert(int value){
            elemrntNum++;
            int current = elemrntNum;
            A[current] = value;
            int parent = current/2;
            while(parent >0 && A[current] > A[parent] ){
                this.swap(current, parent);
                current = parent;
                parent = current/2;
            }
        }
        // private 

        private void swap(int i, int j) {
            int tmp = A[i];
            A[i] = A[j];
            A[j] = tmp;
        }

        public void extract(){
            if(this.elemrntNum < 1) return;
            int terminalValue = this.A[elemrntNum];
            this.A[elemrntNum] = 0;
            int max = this.A[1];
            this.A[1] = terminalValue;
            maxHeapify(1);
            this.elemrntNum--;
            System.out.println(max);
        }

        private void maxHeapify(int i) {
            int leftIndex = i * 2;
            int rightIndex = leftIndex + 1;
            int largerIndex = i;
            if (leftIndex < A.length && A[leftIndex] > A[i])
                largerIndex = leftIndex;
            if (rightIndex < A.length && A[rightIndex] > A[largerIndex])
                largerIndex = rightIndex;
    
            if (largerIndex != i) {
                swap(largerIndex, i);
                maxHeapify(largerIndex);
            }
        }
    }
}
