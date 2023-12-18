import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(sc.next());
        }
        
        int q = partition(a, 0, n-1);
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            if(i == q){
                sb.append("[").append(a[i]).append("] ");
            }else{
                sb.append(a[i]).append(" ");
            }
        }
        sb.deleteCharAt(sb.length()-1);
        
        System.out.println(sb);
    }
    
    static int partition(int[] a, int p, int r){
        
        int x = a[r];
        int i = p-1;
        for(int j = p; j < r; j++){
            if(a[j] <= x){
                i++;
                int k = a[i];
                a[i] = a[j];
                a[j] = k;
            }
        }
        int k = a[i+1];
        a[i+1] = a[r];
        a[r] = k;
        return i+1;
    }
}
