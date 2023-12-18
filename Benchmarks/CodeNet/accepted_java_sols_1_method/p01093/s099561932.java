import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            while(sc.hasNext()) {
                int m = sc.nextInt();
                if(m == 0)break;
                
                int[] a = new int[m+1];
                for(int i=1;i<=m;i++) {
                	 a[i] = sc.nextInt();
                }
                
                Arrays.sort(a);
                int gap = a[m];
                for(int i=1;i<m;i++) {
                	int b = Math.abs(a[i]-a[i+1]);
                	if(b < gap)
                		gap = b;
                }
                
                System.out.println(gap);
            }
        }
    }
}
