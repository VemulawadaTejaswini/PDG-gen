import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;

public class Main {
    static List<Integer> A = new ArrayList<Integer>();
    static void maxHeapify(List<Integer> A, int k){
        int l = 2*k;
        int r = 2*k+1;
        int largest = 0;
    
        if ((l <= (A.size() - 1)) && (A.get(l) > A.get(k))){
            largest = l;
        }else{
            largest = k;
        }
        if ((r <= (A.size() - 1)) && (A.get(r) > A.get(largest))){
            largest = r;
        }
        if (largest != k){
            int tmp = A.get(k);
            A.set(k, A.get(largest));
            A.set(largest, tmp);
            maxHeapify(A, largest);
        }
    }
    
    static void buildMaxHeap(List<Integer> A){
        for (int i=(A.size()-1)/2; i>=0; i--){
            maxHeapify(A,i);
        }
    }        

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while (true){
            String[] line = br.readLine().split(" ");
            String order = line[0];
            if (order.equals("end")) break;
            if (order.equals("insert")){
                int num = Integer.parseInt(line[1]);
                A.add(num);
            }else if (order.equals("extract")){
                buildMaxHeap(A);
                System.out.println(A.get(0));
                A.remove(0);
            }else{ // end
                break;
            }
        }
    }
}