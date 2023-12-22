
import java.util.Scanner;

 class Main {

    static class Elem{
        int val;
        int index;

        public Elem(int val, int index) {
            this.val = val;
            this.index = index;
        }
    }

    public static void heapify(Elem[] heap, int index, int n){
        int left=index*2+1;
        int right = index*2+2;

        int max=index;
        if(left < n && heap[left].val >= heap[max].val){
            max=left;
        }
        if(right<n && heap[right].val >= heap[max].val){
            max=right;
        }
        if(max!=index){
            Elem temp = heap[index];
            heap[index]=heap[max];
            heap[max]=temp;
            heapify(heap, max, n);
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();

        Elem[] heap =new Elem[n];

        for(int i=0;i<n;i++){
            heap[i]=new Elem(a[i],i);
        }

        for(int i=n/2;i>=0;i--){
            heapify(heap, i,n);
        }
//        for(int i=0;i<n;i++){
//            System.out.println(heap[i].val + " " + heap[i].index);
//        }

        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            if(heap[0].index!=i){
                ans[i]=heap[0].val;
            }
            else{
                if(n>=3){
                    ans[i]=Math.max(heap[1].val, heap[2].val);
                }
                else
                    if(n==2){
                    ans[i]=heap[1].val;
                    }
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(ans[i]);
        }

    }
}
