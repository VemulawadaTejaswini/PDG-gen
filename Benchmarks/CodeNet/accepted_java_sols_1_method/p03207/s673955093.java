import java.util.*;
import static java.lang.Math.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        int memo = 0;
        int p[] = new int[n];
        for(int i=0; i<n; i++){
            p[i] = sc.nextInt();
            if(max<p[i]){
                max = p[i];
                memo = i;
            }
        }
        p[memo] = p[memo] / 2;
        int sum = 0;
        for(int i=0; i<n; i++){
            sum += p[i];
        }
        System.out.println(sum);
    }
}
