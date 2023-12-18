import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        int q = Integer.parseInt(sc.next());
        
        int[] point = new int[n+1];
        Arrays.fill(point, k-q);
        for(int i = 0; i < q; i++){
            point[Integer.parseInt(sc.next())]++;
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= n; i++){
            if(point[i] > 0){
                sb.append("Yes").append(System.lineSeparator());
            }else{
                sb.append("No").append(System.lineSeparator());
            }
        }
        
        System.out.println(sb);
    }
}