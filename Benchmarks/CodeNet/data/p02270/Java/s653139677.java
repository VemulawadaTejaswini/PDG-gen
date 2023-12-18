import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        int[] w = new int[n];
        for(int i = 0; i < n; i++){
            w[i] = Integer.parseInt(sc.next());
        }
        
        int left = 0;
        int right = 1000000000;
        while(left < right){
            int mid = (left + right) / 2;
            if(load(w, k, mid) == n){
                right = mid;
            }else{
                left = mid + 1;
            }
        }
        
        System.out.println(left);
    }
    
    static int load(int[] w, int k, int p){
        
        int count = 0;
        for(int i = 0; i < k; i++){
            int truck = 0;
            while(count < w.length && truck + w[count] <= p){
                truck += w[count];
                count++;
            }
        }
        
        return count;
    }
}
