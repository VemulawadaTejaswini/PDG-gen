import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long a[] = new long[n];
        for(int i =0 ; i < n;i++){
            a[i] = sc.nextLong();
        }
        long[] wk = Arrays.stream(a).sorted().toArray();
        long sum = (long)0;
        int x = 0;
        int wksize = wk.length - m;
        //Arrays.stream(wk).forEach(System.out::print);      
        for(long num : wk){
            x++;
            if(x > wksize){
                break;
            }
            sum = sum + num;
          //System.out.println(sum);
        }
        System.out.println(sum);
    }
}