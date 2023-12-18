import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int h = Integer.parseInt(sc.next());
        int[] a = new int[h+1];
        for(int i = 1; i <= h; i++){
            a[i] = Integer.parseInt(sc.next());
        }
        
        buildMaxHeap(a);
        
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= h; i++){
            sb.append(" ").append(a[i]);
        }
        System.out.println(sb);
    }
    
    static void maxHeapify(int[] a, int i){
        
        int h = a.length-1;
        int l = i*2;
        int r = i*2+1;
        int largest;
        
        if(l <= h && a[l] > a[i]){
            largest = l;
        }else{
            largest = i;
        }
        if(r <= h && a[r] > a[largest]){
            largest = r;
        }
        
        if(largest != i){
            int tmp = a[i];
            a[i] = a[largest];
            a[largest] = tmp;
            maxHeapify(a, largest);
        }
    }
    
    static void buildMaxHeap(int[] a){
        
        int h = a.length-1;
        for(int i = h/2; i >= 1; i--){
            maxHeapify(a, i);
        }
    }
}
