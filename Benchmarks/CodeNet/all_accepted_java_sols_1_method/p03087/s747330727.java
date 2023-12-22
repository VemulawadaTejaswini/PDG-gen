
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int q = Integer.parseInt(sc.next());
        char[] s = sc.next().toCharArray();
        int[] sum = new int[n+1];
        for(int i=1;i<n;i++){
            if(s[i] == 'C' && s[i-1] == 'A'){
                sum[i+1] = sum[i] + 1;
            }else{
                sum[i+1] = sum[i];
            }
        }
        int l,r;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<q;i++){
            l = Integer.parseInt(sc.next());
            r = Integer.parseInt(sc.next());
           
            sb.append(sum[r]-sum[l]);
            sb.append('\n');
        }
        System.out.println(sb.toString());
        sc.close();
        
    }
    
}