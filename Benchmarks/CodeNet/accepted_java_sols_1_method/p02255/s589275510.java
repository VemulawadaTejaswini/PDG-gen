import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc  =  new Scanner(System.in);
        int i, v, j, count, n = sc.nextInt();
        int[] a = new int[n];
        for(i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        for(i = 0; i < n ; i++){
            count = 0;
            v = a[i];
            j = i - 1;
            while(j >= 0 && a[j] > v){
                a[j+1] = a[j];
                j--;
                a[j+1] = v;
            }
            for(int answer: a){
                count++;
                if(count > n-1)System.out.println(answer);
                else System.out.print(answer+" ");
                
            }
        }
    }
}

