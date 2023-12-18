import java.util.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] a = new int[N];
        int max = (int)Math.pow(10, 5);
        int[] c = new int[max+2];
        for(int i = 0; i < N; i++){
            a[i] = sc.nextInt();
            if(a[i] == 0){
                c[a[i]]++;
                c[a[i]+1]++;
            } else {
                c[a[i]-1]++;
                c[a[i]]++;
                c[a[i]+1]++;
            }
        }
        sc.close();
        Arrays.sort(c);

        System.out.println(c[max+1]);
        
    }
}