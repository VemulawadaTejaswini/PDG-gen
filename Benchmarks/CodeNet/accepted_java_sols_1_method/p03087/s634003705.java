import java.util.*;
 
public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        String s = sc.next();
        int memo[] = new int[n+1];
        memo[0] = 0;
        for(int i=0; i<n; i++){
            memo[i+1] = memo[i];
            if(i+1 < n && s.charAt(i)=='A' && s.charAt(i+1)=='C'){
                memo[i+1] += 1;
            }
        }

        int l[] = new int[q];
        int r[] = new int[q];

        for(int i=0; i<q; i++){
            l[i] = sc.nextInt();
            r[i] = sc.nextInt();
        }

        for(int i=0; i<q; i++){
            System.out.println(memo[r[i]-1]-memo[l[i]-1]);
        }
    }
}
