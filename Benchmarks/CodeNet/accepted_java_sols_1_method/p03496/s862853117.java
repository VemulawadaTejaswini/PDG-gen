import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] a = new long[N+1];
        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;
        int maxPos = -1;
        int minPos = -1;
        for(int i=1;i<=N;i++){
            a[i] = sc.nextLong();
            if(max<a[i]){
                max = a[i];
                maxPos = i;
            }
            if(min>a[i]){
                min = a[i];
                minPos = i;
            }
        }
        if(max==min){
            System.out.println(0);
            System.exit(0);
        }
        if(Math.abs(max)>=Math.abs(min)){
            System.out.println(2*N-1);
            for(int i=1;i<=N;i++){
                StringBuilder sb = new StringBuilder();
                sb.append(maxPos);
                sb.append(" ");
                sb.append(i);
                System.out.println(sb.toString());
            }
            for(int i=1;i<N;i++){
                StringBuilder sb = new StringBuilder();
                sb.append(i);
                sb.append(" ");
                sb.append(i+1);
                System.out.println(sb.toString());
            }
        }
        else{
            System.out.println(2*N-1);
            for(int i=1;i<=N;i++){
                StringBuilder sb = new StringBuilder();
                sb.append(minPos);
                sb.append(" ");
                sb.append(i);
                System.out.println(sb.toString());
            }
            for(int i=N;i>=2;i--){
                StringBuilder sb = new StringBuilder();
                sb.append(i);
                sb.append(" ");
                sb.append(i-1);
                System.out.println(sb.toString());
            }
        }
    }
}