import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(sc.next());
        }
        
        int count = 0;
        for(int i = 0; i < n; i++){
            int minj = i;
            for(int j = i; j < n; j++){
                if(a[j] < a[minj]){
                    minj = j;
                }
            }
            if(minj != i){
                int x = a[minj];
                a[minj] = a[i];
                a[i] = x;
                count++;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            sb.append(a[i]).append(" ");
        }
        sb.deleteCharAt(sb.length()-1);
        sb.append(System.lineSeparator());
        sb.append(count);
        
        System.out.println(sb);
    }
}
