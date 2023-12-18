import java.util.*;

public class Main {
    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] a = new int[N];
        for(int i=0;i<N;i++) {
            a[i] = scan.nextInt();
        }
        int ans = 0;
        for(int i=0;i<N;i=i+2){
            if((a[i]%2)!=0) ans++;
        }
        System.out.println(ans);
        }
    }
