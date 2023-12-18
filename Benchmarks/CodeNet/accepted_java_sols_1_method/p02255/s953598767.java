import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(sc.next());
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            sb.append(a[i]).append(" ");
        }
        sb.delete(sb.length()-1, sb.length());
        sb.append(System.lineSeparator());
        
        for(int i = 1; i < n; i++){
            int v = a[i];
            int j = i-1;
            while(j >= 0 && a[j] > v){
                a[j+1] = a[j];
                j--;
                a[j+1] = v;
            }
            
            for(int k = 0; k < n; k++){
                sb.append(a[k]).append(" ");
            }
            sb.delete(sb.length()-1, sb.length());
            sb.append(System.lineSeparator());
        }
        
        System.out.print(sb);
    }
}
